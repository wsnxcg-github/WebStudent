package com.chen.springbootssm.service.impl;

import com.chen.springbootssm.mapper.UserMapper;
import com.chen.springbootssm.pojo.User;
import com.chen.springbootssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/**
 * @author chenjing
 * @create 2020-07-06 23:03
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public boolean login(User user, HttpSession session) {
        User resultUser = userMapper.selectUserByUserName(user.getUserName());
        if(resultUser!=null&&resultUser.getPassword().equals(user.getPassword())){
            session.setAttribute("userInfo", user);
            return true;
        }
        return false;
    }
}
