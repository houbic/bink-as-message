var Login = function() {
	return {
		init: function() {

			$('.login-form').validate({
				errorElement: 'label', //default input error message container
				errorClass: 'help-inline', // default input error message class
				focusInvalid: false, // do not focus the last invalid input
				rules: {
					username: {
						required: true,
						minlength: 1,
						maxlength: 32
					},
					password: {
						required: true,
						minlength: 1,
						maxlength: 32
					},
					remember: {
						required: false
					}
				},

				messages: {
					username: {
						required: "用户名不能为空！",
						minlength: "用户名不能小于1位",
						maxlength: "用户名不能超过32位"

					},
					password: {
						required: "密码不能为空！",
						minlength: "密码不能小于1位",
						maxlength: "密码不能超过32位"
					}
				},

				invalidHandler: function(event, validator) { //display error alert on form submit
					$('.alert-error', $('.login-form')).show();
					$('.alert-login-error', $('.login-form')).hide();
				},

				highlight: function(element) { // hightlight error inputs
					$(element).closest('.control-group').addClass('error');
					// set error class to the control group
				},

				success: function(label) {
					label.closest('.control-group').removeClass('error');
					label.remove();
				},

				errorPlacement: function(error, element) {
					error.addClass('help-small no-left-padding').insertAfter(element.closest('.input-icon'));
				},
				//这个函数是在前面验证之后才执行
				submitHandler: function(form) {
					var params = $('#login_form').serialize();
					//序列化表单的值
					$.ajax({
						type: "post",
						url: "/message/checkLogin",
						dataType: "json",
						data: params,
						success: function(data) {
							if (data != 200) {
								alert("用户或密码错误！");
								return false;
							} else {
								form.submit();
								window.location.href = "/message/index.html";
								return false;
							}
						}
					});

				}
			});

			$('.login-form input').keypress(function(e) {
				if (e.which == 13) {
					if ($('.login-form').validate().form()) {
						$('.login-form').validate().submitHandler();

					}

					return false;
				}
			});
		}
	};

}();