package com.bink.entity;

import java.io.Serializable;

/**
 * Created by chenbinghao on 16/9/1.下午10:09
 */
public class InputUser implements Serializable {

    private static final long serialVersionUID = -5809782578272943999L;

    private String userName;

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
