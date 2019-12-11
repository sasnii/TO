/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

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
public class SandwichTest {
    
    
    public void whenDecoratorsInjectedAtRuntime_thenConfigSuccess() {
    Sandwich sandwich = new Ketchup(new SandwichImpl());
    assertEquals(sandwich.decorate(), 
      "Sandwich with Ketchup");
}
    
    public SandwichTest() {
    }
    

    public class SandwichImpl implements Sandwich {

        public String decorate() {
            return "";
        }
    }
    
}
