package com.bink.constant;

/**
 * Created by chenbinghao on 16/9/1.下午3:51
 */
public enum ErrorCode {

    USER_LOGIN_SUCCESS(200, "login success"),

    USER_LOGIN_USERNAME_ERROR(410, "user name not exists"),

    USER_LOGIN_PASSWORD_ERROR(411, "password is incorrect")

    ;

    private int code;

    private String message;


    ErrorCode(int code, String message) {
        this.code = code;
        this.message =message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
