package com.creditchecker.demo.controller;

import com.creditchecker.demo.dto.CompanyResponseDTO;
import com.creditchecker.demo.service.CompanyService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

@Controller
public class WebController {

    private final CompanyService companyService;

    public WebController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/")
    public String showHomePage() {
        return "index";
    }

    @GetMapping("/credit-score")
    public String getCreditScore(@RequestParam("companyNumber") String companyNumber, Model model) {
        try {
            // Fetch the company details
            CompanyResponseDTO company = companyService.getCompanyDetails(companyNumber);

            // Add the individual attributes directly to the model
            model.addAttribute("companyNumber", company.getCompanyNumber());

            return "credit-score";
        } catch (Exception e) {
            return "error";
        }
    }
}

