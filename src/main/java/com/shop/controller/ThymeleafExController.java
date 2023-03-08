package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/thymeleaf")
public class ThymeleafExController {

    @GetMapping(value = "/main")
    public String main() {
        return "index";
    }

    @GetMapping(value = "/boardwrite")
    public String boardWrite() {
        return "board/write";
    }

    @GetMapping(value = "/signup")
    public String signup() {
        return "board/signup";
    }
}
