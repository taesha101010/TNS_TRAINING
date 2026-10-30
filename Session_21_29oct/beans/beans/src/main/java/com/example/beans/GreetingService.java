package com.example.beans;

import org.springframework.stereotype.Component;
@Component
public class GreetingService {

    /*
     * This is a regular business method. Spring manages the object, but
     * the method is still called like any normal Java method.
     *
     * Example:
     *     service.greet("Anish")
     * returns:
     *     Welcome, Anish!
     */
    public String greet(String name) {
        return "Welcome, " + name + "!";
    }
}