package edu.daffodilvarsity.a2zservice.model;

public class UpcomingEvents extends Events {
    private String registerUrl;
    private String helpUrl;

    public UpcomingEvents() {

    }

    public UpcomingEvents(String registerUrl, String helpUrl) {
        this.registerUrl = registerUrl;
        this.helpUrl = helpUrl;
    }

    public UpcomingEvents(String eventName, String eventVenue, String eventType, String finishedTime, String eventDate, String eventMonth, String location, String registerUrl, String helpUrl) {
        super(eventName, eventVenue, eventType, finishedTime, eventDate, eventMonth, location);
        this.registerUrl = registerUrl;
        this.helpUrl = helpUrl;
    }

    public String getRegisterUrl() {
        return registerUrl;
    }

    public void setRegisterUrl(String registerUrl) {
        this.registerUrl = registerUrl;
    }

    public String getHelpUrl() {
        return helpUrl;
    }

    public void setHelpUrl(String helpUrl) {
        this.helpUrl = helpUrl;
    }
}
