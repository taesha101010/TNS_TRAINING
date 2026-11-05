package com.tnsif.jpacurd.dao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

//Initializes JPA and provides access to the database

public class JPAUtil {

    private static EntityManagerFactory factory;

    static {
        factory = Persistence.createEntityManagerFactory("BookPU");
    }

    public static EntityManager getEntityManager() {
        return factory.createEntityManager();
    }
}
