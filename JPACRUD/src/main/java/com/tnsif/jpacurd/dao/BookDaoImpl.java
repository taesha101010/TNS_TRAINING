package com.tnsif.jpacurd.dao;
import com.tnsif.jpacurd.entities.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.List;
import com.tnsif.jpacurd.dao.BookDao;


public class BookDaoImpl implements BookDao {
 @Override
 public void addBook(Book book) {
     EntityManager em = JPAUtil.getEntityManager();
     EntityTransaction et = em.getTransaction();

     try {
         et.begin();
         em.persist(book);
         et.commit();
     } catch (Exception e) {
         if (et.isActive()) {
             et.rollback();
         }
         e.printStackTrace();
     } finally {
         em.close();
     }
 }

    @Override
    public List<Book> getAllBooks() {
        EntityManager em = JPAUtil.getEntityManager();

        try {
            return em.createQuery("SELECT b FROM Book b", Book.class)
                    .getResultList();
        } finally {
            em.close();
        }
    }

    @Override
    public Book getBookById(int id) {
        EntityManager em = JPAUtil.getEntityManager();

        try {
            return em.find(Book.class, id);
        } finally {
            em.close();
        }
    }

    @Override
    public void updateBook(Book book) {
        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            et.begin();
            em.merge(book);
            et.commit();
        } catch (Exception e) {
            if (et.isActive()) {
                et.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    @Override
    public void deleteBook(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            et.begin();

            Book book = em.find(Book.class, id);

            if (book != null) {
                em.remove(book);
            }

            et.commit();
        } catch (Exception e) {
            if (et.isActive()) {
                et.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

}
