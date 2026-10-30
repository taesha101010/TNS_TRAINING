package com.example.beans;

import com.example.beans.MessageRepository;
import com.example.beans.MessageService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConstructorInjectionExample {

    public static void main(String[] args) {
        // Create an empty annotation-based Spring container.
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {
            /*
             * register() adds both classes to the container.
             * refresh() below causes Spring to create them and resolve
             * the constructor dependency between them.
             */
            context.register(MessageRepository.class, MessageService.class);
            context.refresh();

            // Retrieve the fully-created service and call its method.
            MessageService service = context.getBean(MessageService.class);
            System.out.println(service.getMessage());
        }
    }
}