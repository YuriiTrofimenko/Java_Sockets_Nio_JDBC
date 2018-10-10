/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.eclipselinkdemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.tyaa.eclipselinkdemo.entity.Books;
import org.tyaa.eclipselinkdemo.jpa.BooksJpaController;

/**
 *
 * @author student
 */
public class EclipseLinkDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EntityManagerFactory factory = 
            Persistence.createEntityManagerFactory("EclipseLinkDemoPU");
        
        for (Books book : new BooksJpaController(factory).findBooksEntities()) {
            System.out.println(book.getTitle());
        }
    }
    
}
