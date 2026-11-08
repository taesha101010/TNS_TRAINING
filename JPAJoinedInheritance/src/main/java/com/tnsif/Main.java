package com.tnsif;
import com.tnsif.entity.Employee;
import com.tnsif.entity.Manager;
import jakarta.persistence.EntityManager;
import  jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JoinedPU");

        EntityManager em = emf.createEntityManager();


        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();

            //Creating employee object

        Employee e1 = new Employee("Tana ", 646510);
        em.persist(e1);

        //create manager object
        Manager m1 = new Manager("daneial", 49900, "IT");
        em.persist(m1);

        tx.commit();

        System.out.println("Records inserted succesfully");}

        catch (Exception e){
            if (tx.isActive()){
                tx.rollback();
            }

            e.printStackTrace();
        }

        finally {


        em.close();
        emf.close();}
    }
}