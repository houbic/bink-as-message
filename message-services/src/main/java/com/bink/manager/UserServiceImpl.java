package com.bink.manager;

import com.bink.base.UserService;
import com.bink.constant.ErrorCode;
import com.bink.entity.InputUser;
import com.bink.entity.User;
import com.bink.mybatis.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * Created by chenbinghao on 16/9/1.
 */
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public int checkLogin(InputUser inputUser) {

        if (StringUtils.isEmpty(inputUser.getUserName()))
            return ErrorCode.USER_LOGIN_USERNAME_ERROR.getCode();

        User user = userMapper.getUserByName(inputUser.getUserName());
        if (user == null)
            return ErrorCode.USER_LOGIN_USERNAME_ERROR.getCode();

        if (inputUser.getPassword().equals(user.getPassword()))
            return ErrorCode.USER_LOGIN_SUCCESS.getCode();
        else
            return ErrorCode.USER_LOGIN_PASSWORD_ERROR.getCode();

    }

    public int checkLogin(String userName, String password) {

        if (StringUtils.isEmpty(userName))
            return ErrorCode.USER_LOGIN_USERNAME_ERROR.getCode();

        User user = userMapper.getUserByName(userName);
        if (user == null)
            return ErrorCode.USER_LOGIN_USERNAME_ERROR.getCode();

        if (password.equals(user.getPassword()))
            return ErrorCode.USER_LOGIN_SUCCESS.getCode();
        else
            return ErrorCode.USER_LOGIN_PASSWORD_ERROR.getCode();

    }

}
