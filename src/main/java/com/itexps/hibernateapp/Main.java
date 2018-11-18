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

        
        HibernateUtils.shutdown();
    }
}
