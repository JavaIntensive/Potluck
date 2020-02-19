package com.example.group3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){

        return "index";
    }

    @PostMapping("/list")
    public String list(){

        return "list";
    }

    @GetMapping("/author")
    public String author(){

        return "author";
    }


}
