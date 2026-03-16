package com.greengrub.mcp_server.service;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HungerReliefMcpTools {

    private final RestTemplate restTemplate;

    private static final String FOOD_REQUEST_SERVICE = "http://localhost:8081/ai/food-requests";

    public HungerReliefMcpTools(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Tool(description = "Find all available surplus food listings near a given city or pincode")
    public String getAvailableFoodNearby(
            @ToolParam(description = "City name or pincode to search near") String location
    ) {
        String url = FOOD_REQUEST_SERVICE + "?location=" + location + "&status=AVAILABLE";
        try {
            ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
            return response.getBody();
        } catch (Exception e) {
            return "Could not fetch food listings: " + e.getMessage();
        }
    }
}
