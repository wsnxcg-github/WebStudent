package com.chen.springbootssm.service;

import com.chen.springbootssm.pojo.User;

import javax.servlet.http.HttpSession;

/**
 * @author chenjing
 * @create 2020-07-06 23:02
 */
public interface UserService {
    public abstract boolean login(User user, HttpSession session);
}
