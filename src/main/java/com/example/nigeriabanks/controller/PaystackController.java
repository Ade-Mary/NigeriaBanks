package com.example.nigeriabanks.controller;

import com.example.nigeriabanks.service.PaystackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/paystack")
public class PaystackController {

    @Autowired
    private PaystackService paystackService;

    @GetMapping("/banks")
    public Map<String, Object> getBanks() {
        return paystackService.getBanks();
    }
}
