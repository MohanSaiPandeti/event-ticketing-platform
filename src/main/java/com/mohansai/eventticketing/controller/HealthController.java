package com.mohansai.eventticketing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import com.mohansai.eventticketing.dto.HealthResponse;

@RestController
public class HealthController {

    @GetMapping("/api/v1/health")
    public HealthResponse health() {

        return new HealthResponse(
                "UP",
                "event-ticketing-platform",
                "1.0.0",
                LocalDateTime.now()
        );
    }

}
