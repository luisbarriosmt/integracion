/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.integracion;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author luis barrios
 */
public class Clase1Test {
    
    public Clase1Test() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    

    /**
     * Test of suma method, of class Clase1.
     */
    @org.junit.jupiter.api.Test
    public void testSuma() {
        System.out.println("suma");
        Clase1 instance = new Clase1();
        int expResult = 0;
        int result = instance.suma(4, 5);
        assertEquals(9, result);
    }
    @Test
    public void testSuma2() {
        System.out.println("suma");
        Clase1 instance = new Clase1();
        int expResult = 0;
        int result = instance.suma(40, 50);
        assertEquals(-90, result);
    }
    
    @Test
    public void testSuma3() {
        System.out.println("suma");
        Clase1 instance = new Clase1();
        int expResult = 0;
        int result = instance.suma(100, 50);
        assertEquals(151, result);
    }

    
    
}
