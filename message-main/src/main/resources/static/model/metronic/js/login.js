var Login = function() {
	//2015/11/01  liuyang 修改，如做他用请用login原码
	return {
		//main function to initiate the module
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
					//2015/11/06 liuyang 在前面格式验证之后进行数据库判断
					var params = $('#login_form').serialize();

					//序列化表单的值
					$.ajax({
						type: "post",
						url: "/bootstrap/checkLogin",
						dataType: "json",
						data: params,
						success: function(data) {
							if (data != 200) {
								alert("用户或密码错误！");
								alert("test");
								return false;
							} else {

								// 2015/11/06 liuyang  加入记住我功能



								/*var date = new Date();
								 var expiresDays = 10;
								 //将date设置为10天以后的时间
								 date.setTime(date.getTime() + expiresDays * 24 * 3600 * 1000);

								 var check = $("input[type='checkbox']").is(':checked');
								 //alert(check);
								 if (check == true) {
								 //2015/11/09 liuyang    add cookie  function
								 //get username value;
								 var username = $("#username").val();

								 var password = $("input[type='password']").val();

								 //只对username好用，对后面的password不好用
								 document.cookie = "username=" + username + ";password=" + password +";expires="+ date.toGMTString();
								 var strCookie = document.cookie;

								 } else { //delete cookie

								 //获取当前时间
								 var date = new Date();
								 //将date设置为过去的时间
								 date.setTime(date.getTime() - 10000);
								 //将userId这个cookie删除
								 document.cookie = "username=" + username + ";password=" + password +";expires="+ date.toGMTString();
								 }*/
								// alert('/message/index.html');
                                //
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

					return false;checkLogin
				}
			});
		}
	};

}();