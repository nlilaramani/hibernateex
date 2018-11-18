/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.hibernateapp;

import com.itexps.web.model.User;
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
            session.save(user);
        }
        
        
    } 
}
