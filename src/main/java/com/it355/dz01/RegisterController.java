package com.it355.dz01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


@Controller
@RequestMapping("/register")
public class RegisterController {
        @RequestMapping(method = RequestMethod.GET)
        public String showForm(ModelMap model) {
        //model.addAttribute("poruka", "IT355 Domaći1");
        return "register";
    }
}
