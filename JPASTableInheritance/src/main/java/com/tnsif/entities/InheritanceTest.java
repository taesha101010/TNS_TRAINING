package com.tnsif.entities;
import com.tnsif.entities.Employee;
import com.tnsif.entities.Manager;
import jakarta.persistence.*;

public class InheritanceTest {
    public static void main(String[] args){
        //connecting to the persistence unit
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("InheritancePU");

        //create EntityManager
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();

            Employee e1 = new Employee("Tanisha", 100000000);

            Manager m1 = new Manager("Taehsa", 3264208, "IT" );

            em.persist(e1);
            em.persist(m1);

            tx.commit();

            System.out.println("Records saved succesfully!");
        }
        catch (Exception e){
            if (tx.isActive()){
                tx.rollback();
            }

            e.printStackTrace();
        }
        finally{
            em.close();
            emf.close();

        }

    }
}
