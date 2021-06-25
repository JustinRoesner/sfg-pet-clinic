package com.hugesalt.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index.html"})
    public String index(){

        //this tells thymeleaf to look for a file called index.html
        return "index";
    }
}
