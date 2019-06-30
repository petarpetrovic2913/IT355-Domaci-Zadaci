package com.it355.dz01;

import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
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

    @Autowired
    private MessageSource messageSource;

    @RequestMapping(method = RequestMethod.GET)
    public String showForm(ModelMap model) {
        //model.addAttribute("poruka", "IT355 Domaći1");
        System.out.println("Pozivam message source");
        System.out.println(messageSource.getMessage("username", null, Locale.ENGLISH));
        System.out.println(messageSource.getMessage("password", null, Locale.ENGLISH));
        System.out.println(messageSource.getMessage("confirmPassword", null, Locale.ENGLISH));
        System.out.println(messageSource.getMessage("emailAdress", null, Locale.ENGLISH));
        System.out.println(messageSource.getMessage("name", null, Locale.ENGLISH));
        System.out.println(messageSource.getMessage("surname", null, Locale.ENGLISH));
        return "register";

    }
}
