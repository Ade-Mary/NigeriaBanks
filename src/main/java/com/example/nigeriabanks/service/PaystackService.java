package com.example.nigeriabanks.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class PaystackService {

    private final String PAYSTACK_API_URL = "https://api.paystack.co/bank";
    private final String SECRET_KEY = "sk_test_61c4105d9ef5785a60c6b754b48f6bffa882ea66"; // Replace with your Paystack Secret Key

    public Map<String, Object> getBanks() {
        RestTemplate restTemplate = new RestTemplate();

        // Set up the headers
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + SECRET_KEY);
        headers.set("Content-Type", "application/json");

        // Create the request entity
        HttpEntity<String> entity = new HttpEntity<>(headers);

        // Make the request
        ResponseEntity<Map> response = restTemplate.exchange(PAYSTACK_API_URL, HttpMethod.GET, entity, Map.class);

        // Return the response body
        return response.getBody();
    }
}
