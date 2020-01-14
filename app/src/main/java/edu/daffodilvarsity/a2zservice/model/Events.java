package edu.daffodilvarsity.a2zservice.model;

public class Events {
    private String eventName;
    private String eventVenue;
    private String eventType;

    private String finishedTime;

    private String eventDate;
    private String eventMonth;

    private String location;

    public Events() {
    }

    public Events(String eventName, String eventVenue, String eventType, String finishedTime, String eventDate, String eventMonth, String location) {
        this.eventName = eventName;
        this.eventVenue = eventVenue;
        this.eventType = eventType;
        this.finishedTime = finishedTime;
        this.eventDate = eventDate;
        this.eventMonth = eventMonth;
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventVenue() {
        return eventVenue;
    }

    public void setEventVenue(String eventVenue) {
        this.eventVenue = eventVenue;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getFinishedTime() {
        return finishedTime;
    }

    public void setFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventMonth() {
        return eventMonth;
    }

    public void setEventMonth(String eventMonth) {
        this.eventMonth = eventMonth;
    }
}
