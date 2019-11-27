/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kubas
 */
public class RegularSandwichIngredientsFactoryTest {
    
    public RegularSandwichIngredientsFactoryTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testCreateBread() {
        System.out.println("createBread");
        RegularSandwichIngredientsFactory instance = new RegularSandwichIngredientsFactory();
        Bread expResult = null;
        Bread result = instance.createBread();
        assertEquals(expResult, result);
    }

    @Test
    public void testCreateButter() {
        System.out.println("createButter");
        RegularSandwichIngredientsFactory instance = new RegularSandwichIngredientsFactory();
        Butter expResult = null;
        Butter result = instance.createButter();
        assertEquals(expResult, result);
    }

    @Test
    public void testCreateChesse() {
        System.out.println("createChesse");
        RegularSandwichIngredientsFactory instance = new RegularSandwichIngredientsFactory();
        Chesse expResult = null;
        Chesse result = instance.createChesse();
        assertEquals(expResult, result);
    }
    
}
