package com.mohansai.eventticketing.service;

import org.springframework.stereotype.Service;
import com.mohansai.eventticketing.dto.HealthResponse;
import java.time.LocalDateTime;


@Service
public class HealthService {
    public HealthResponse getHealthStatus(){
        return new HealthResponse(
                "UP",
                "event-ticketing-platform",
                "1.0.0",
                LocalDateTime.now()
        );
    }
}
