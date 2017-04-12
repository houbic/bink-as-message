package com.bink.base;

import com.bink.entity.InputUser;

/**
 * Created by chenbinghao on 16/9/1.
 */
public interface UserService {

    /**
     * 登录校验
     * @param inputUser
     * @return
     */
    int checkLogin(InputUser inputUser);

    int checkLogin(String userName, String password);

}
