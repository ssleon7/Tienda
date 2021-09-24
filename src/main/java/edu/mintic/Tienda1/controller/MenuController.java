package edu.mintic.Tienda1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {

    @GetMapping("/menu")
    public String menu(){
        return "menu";
    }
    @GetMapping("/user")
    public String user(){
        return "user";
    }


}
