package edu.daffodilvarsity.a2zservice.model;

public class OngoingEvents extends Events {
    public OngoingEvents() {
    }

    public OngoingEvents(String eventName, String eventVenue, String eventType, String finishedTime, String eventDate, String eventMonth, String location) {
        super(eventName, eventVenue, eventType, finishedTime, eventDate, eventMonth, location);
    }
}
