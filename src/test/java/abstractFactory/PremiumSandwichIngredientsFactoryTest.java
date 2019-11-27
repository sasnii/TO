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
public class PremiumSandwichIngredientsFactoryTest {
    
    public PremiumSandwichIngredientsFactoryTest() {
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
        PremiumSandwichIngredientsFactory instance = new PremiumSandwichIngredientsFactory();
        Bread expResult = null;
        Bread result = instance.createBread();
        assertEquals(expResult, result);
    }

    @Test
    public void testCreateButter() {
        System.out.println("createButter");
        PremiumSandwichIngredientsFactory instance = new PremiumSandwichIngredientsFactory();
        Butter expResult = null;
        Butter result = instance.createButter();
        assertEquals(expResult, result);
    }

    @Test
    public void testCreateChesse() {
        System.out.println("createChesse");
        PremiumSandwichIngredientsFactory instance = new PremiumSandwichIngredientsFactory();
        Chesse expResult = null;
        Chesse result = instance.createChesse();
        assertEquals(expResult, result);
    }
    
}
