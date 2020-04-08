package com.weifeng.community.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HeeloController {

    @GetMapping("hello")
    public String hello(@RequestParam(name = "name") String name, Model model){
        model.addAttribute("key",name);
return "hello";
    }
}
