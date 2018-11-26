/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.hibernateapp;

import com.itexps.web.model.User;

/**
 *
 * @author itexps
 */
public class Main {
    public static void main(String[] args) {

        int id = 1;
        User user = UserService.getUserById(id);
        System.out.println(user);
        
        User user1=new User();
        //user1.setId(2);
        user1.setFname("Robert");
        user1.setLname("Iliffe");
        user1.setEmail("aa@aa.com");
        user1.setGender("M");
        user1.setUsername("robert");
        user1.setPassword("password");
        //user1.setDob();
        UserService.saveUser(user1);
        
        UserService.getUsers().forEach((user2) -> {
            System.out.println(user2);
        });
        
        User u1=UserService.getUserById(1);
        u1.setUsername(u1.getFname());
        u1.setPassword(u1.getLname());
        UserService.updateUser(u1);
        UserService.deleteUser(3);
        HibernateUtils.shutdown();
        
    }
}
