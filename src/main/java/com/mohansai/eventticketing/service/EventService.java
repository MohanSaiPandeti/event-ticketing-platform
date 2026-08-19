package com.mohansai.eventticketing.service;

import com.mohansai.eventticketing.dto.request.CreateEventRequest;
import com.mohansai.eventticketing.entity.Event;
import com.mohansai.eventticketing.enums.EventStatus;
import com.mohansai.eventticketing.repository.EventRepository;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public Event createEvent(CreateEventRequest request) {

        Event event = new Event();

        event.setTitle(request.getTitle());
        event.setDescription(request.getDescription());
        event.setVenue(request.getVenue());
        event.setCity(request.getCity());
        event.setEventDate(request.getEventDate());
        event.setEventTime(request.getEventTime());
        event.setTicketPrice(request.getTicketPrice());
        event.setTotalSeats(request.getTotalSeats());
        event.setAvailableSeats(request.getTotalSeats());
        event.setCategory(request.getCategory());
        event.setStatus(EventStatus.ACTIVE);
        event.setImageUrl(request.getImageUrl());

        return eventRepository.save(event);
    }
}
