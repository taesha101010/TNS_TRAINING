package com.tnsif;

import com.tnsif.entity.Employee;
import com.tnsif.entity.Manager;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("TablePerClassPU");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();

            Employee e1 = new Employee("Tanisha", 30000);

            Manager m1 = new Manager("Rahul", 50000, "IT");

            em.persist(e1);
            em.persist(m1);

            tx.commit();

            System.out.println("Records inserted successfully!");

        } catch (Exception e) {

            if (tx.isActive()) {
                tx.rollback();
            }

            e.printStackTrace();

        } finally {
            em.close();
            emf.close();
        }

    }
}
