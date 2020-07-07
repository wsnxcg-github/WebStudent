package com.chen.springbootssm.interceptor;

import com.chen.springbootssm.pojo.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @author chenjing
 * @create 2020-07-07 15:22
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object handler) throws Exception {
        List<String> notInterceptorPage = new ArrayList<>();
        notInterceptorPage.add("/login.do");

        //获取请求地址
        String uri = req.getRequestURI();
        if (notInterceptorPage.contains(uri)) {
            return true;
        }

        if (req.getSession().getAttribute("userInfo") == null) {
            resp.sendRedirect(req.getContextPath() + "/");
            return false;
        }

        return true;
    }
}
