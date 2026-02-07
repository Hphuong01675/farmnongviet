package com.farmnongviet.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactController {

    @GetMapping("/contact")
    public String contact(Model model){

        model.addAttribute("content", "pages/contact");
        model.addAttribute("activePage", "contact");

        model.addAttribute("companyName", "Farm Nông Việt");
        model.addAttribute("phone", "84798164267");
        model.addAttribute("email", "contact@farmnongviet.com");
        model.addAttribute("website", "www.farmnongviet.com");
        model.addAttribute("address",
                "83/19 Đường 22, Phường Phước Long B, TP. Thủ Đức, TP.HCM");

        return "layout/base";
    }
}