package com.mohansai.eventticketing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import com.mohansai.eventticketing.dto.HealthResponse;
import com.mohansai.eventticketing.service.HealthService;

@RestController
public class HealthController {

    private final HealthService healthService;

    public HealthController(HealthService healthService){
        this.healthService = healthService;
    }
    @GetMapping("/api/v1/health")
    public HealthResponse health() {

        return healthService.getHealthStatus();
    }

}
