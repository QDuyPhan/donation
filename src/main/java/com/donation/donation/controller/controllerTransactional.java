package com.donation.donation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controllerTransactional {


    // Phương thức này trả về trang Home với fragment "homeFragment"
    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("contentFragment", "Home/home :: homeFragment");
        System.out.println("Content Fragment: " + model.getAttribute("contentFragment"));
        return "Home/home";
    }



    // Phương thức này trả về trang ViTreEm với fragment "indexFragment"
    @GetMapping("/ViTreEmFragment")
    public String ViTreEmPage(Model model) {
        model.addAttribute("contentFragment", "Hoancanhquyengop/ViTreEm/index :: indexFragment");
        return "Hoancanhquyengop/ViTreEm/index"; // Return ViTreEm page template
    }
    @GetMapping("/NguoiGiaFragment")
    public String NguoiGiaPage(Model model) {
        model.addAttribute("contentFragment", "Hoancanhquyengop/NguoiGia/index :: indexFragment");
        return "Hoancanhquyengop/NguoiGia/index"; // Return ViTreEm page template
    }
}
