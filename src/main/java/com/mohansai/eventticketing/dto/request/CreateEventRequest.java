package com.mohansai.eventticketing.dto.request;

import com.mohansai.eventticketing.enums.EventCategory;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class CreateEventRequest {
    @NotBlank(message="Title is required")
    @Size(max = 255, message="Title cannot exceed 255 characters")
    private String title;

    @NotBlank(message="Description is required")
    private String description;

    @NotBlank(message="Venue is required")
    private String venue;

    @NotBlank(message="City is required")
    private String city;

    public CreateEventRequest() {
    }

    @NotNull(message="Event date is required")
    private LocalDate eventDate;

    @NotNull(message="Event time is required")
    private LocalTime eventTime;

    @NotNull(message="Ticket price is required")
    @Positive(message="Ticket price must be greater than zero")
    private BigDecimal ticketPrice;

    @NotNull(message="Total seats is required")
    @Positive(message="Total seats must be greater than zero")
    private Integer totalSeats;

    @NotNull(message="Category is required")
    private EventCategory category;

    private String imageUrl;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public BigDecimal getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(BigDecimal ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public Integer getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(Integer totalSeats) {
        this.totalSeats = totalSeats;
    }

    public EventCategory getCategory() {
        return category;
    }

    public void setCategory(EventCategory category) {
        this.category = category;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public LocalTime getEventTime() {
        return eventTime;
    }

    public void setEventTime(LocalTime eventTime) {
        this.eventTime = eventTime;
    }
}
