package com.megaproject.accountservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    @GetMapping("/users")
    public String getLoginPage(){
        return "account.users";
    }

    @GetMapping("/admins")
    public String getSuccessPage(){
        return "account.admins";
    }
}
