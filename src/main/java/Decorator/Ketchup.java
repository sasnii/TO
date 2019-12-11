/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author kubas
 */
public class Ketchup extends SandwichDecorator {
    public Ketchup(Sandwich sandwich){
        super(sandwich);
    }
    
    public String decorate(){
        return super.decorate() + decorateWithKetchup();
    }
    
    private String decorateWithKetchup(){
        return " with Ketchup";
    }
}
