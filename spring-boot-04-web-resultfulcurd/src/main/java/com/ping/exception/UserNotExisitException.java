package com.ping.exception;

public class UserNotExisitException extends RuntimeException {
    public UserNotExisitException() {
        super("用户不存在！");
    }
}
