package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class MessageRepository {

    /*
     * This method represents a data lookup. In a real application it might
     * return data fetched from a database, file, or web service.
     */
    public String findMessage() {
        return "Message loaded by the repository";
    }
}