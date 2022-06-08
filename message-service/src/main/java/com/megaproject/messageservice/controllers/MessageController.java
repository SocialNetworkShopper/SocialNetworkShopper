package com.megaproject.messageservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {

    @GetMapping("/users")
    public String getLoginPage(){
        return "message.users";
    }

    @GetMapping("/admins")
    public String getSuccessPage(){
        return "message.admins";
    }
}