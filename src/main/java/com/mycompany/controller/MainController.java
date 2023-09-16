package com.mycompany.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/index.html")
    public String showHomePage() {
        return "index";
    }

    @GetMapping("/loginPage.html")
    public String showLoginPage() {
        return "loginPage";
    }

    @GetMapping("/jobPage.html")
    public String showJobsPage() {
        return "jobPage";
    }

    @GetMapping("/createUser.html")
    public String showCreateUserPage() {
        return "createUser";
    }

    @GetMapping("/consultantPage.html")
    public String showConsultantPage() {
        return "consultantPage";
    }

    @GetMapping("/profile.html")
    public String showProfilePage() {
        return "profile";
    }


}

