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
        model.addAttribute("email", "bachhoangngan.vn@gmail.com");
        model.addAttribute("website", "www.farmnongviet.com");
        model.addAttribute("address",
                "21 Trường Công Định, Phường Tân Bình, Thành phố Hồ Chí Minh");

        return "layout/base";
    }
}