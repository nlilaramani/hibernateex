/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.hibernateapp;

import com.itexps.web.model.User;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author itexps
 */
public class UserService {
    public static User getUserById(int id) {
        
        User user;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            user = session.get(User.class, id);
        }
        
        return user;
    }    
    
    public static void saveUser(User user) {
        
        
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
           session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
        }
    }
     public static List<User> getUsers() {
        
        List<User> users;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            users = session.createQuery("from User").list();
        }
        return users;
    }   
     
     public static void deleteUser(int id) {
        
        List<User> users;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            session.beginTransaction();
            User user=session.get(User.class, id);
            session.delete(user);
            session.getTransaction().commit();
        }
        
    }   
    
     public static void updateUser(User user) {
        
        
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
           session.beginTransaction();
           session.update(user);
        //   session.save(user);
           session.getTransaction().commit();
        }
    }
}
