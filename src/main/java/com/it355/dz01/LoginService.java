/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.dz01;

/**
 *
 * @author mirai
 */
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public String validateUser(LoginBean loginBean) {
        String userName = loginBean.getUserName();
        String password = loginBean.getPassword();
        if (userName.equals("user")
                && password.equals("user")) {
            return "true";
        } else {
            return "false";
        }
    }
}
