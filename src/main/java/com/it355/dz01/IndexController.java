/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.dz01;

/**
 *
 * @author Korisnik
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("/")

public class IndexController {

    @RequestMapping(method = RequestMethod.GET)
    public String showIndex(ModelMap model) {
        //model.addAttribute("poruka", "IT355 Domaći1");
        return "index";
    }
}
