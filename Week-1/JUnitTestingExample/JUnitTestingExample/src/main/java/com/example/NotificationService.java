package com.example;

public class NotificationService {

    private MessageService service;

    public NotificationService(MessageService service) {
        this.service = service;
    }

    public String notifyUser(String message) {
        return service.sendMessage(message);
    }
}