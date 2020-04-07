package com.chat.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {
/*    @GetMapping("/chat")
    public String chat() {
        return "chat.html";
    }*/

    @GetMapping("/")
    public String home() {
        return "chat.html";
    }

    @GetMapping("/left")
    public String left() {
        return "leave.html";
    }
}
