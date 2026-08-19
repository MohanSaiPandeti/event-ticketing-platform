package com.mohansai.eventticketing.controller;

import com.mohansai.eventticketing.dto.request.CreateEventRequest;
import com.mohansai.eventticketing.entity.Event;
import com.mohansai.eventticketing.service.EventService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/events")
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @PostMapping
    public ResponseEntity<Event> createEvent(
            @Valid @RequestBody CreateEventRequest request) {

        Event createdEvent = eventService.createEvent(request);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(createdEvent);
    }
}