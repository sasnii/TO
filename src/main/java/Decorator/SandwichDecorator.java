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
public class SandwichDecorator implements Sandwich {
    private Sandwich sandwich;
    
    public SandwichDecorator(Sandwich sandwich) {
        this.sandwich = sandwich;
    }
    
    @Override
    public String decorate(){
        return sandwich.decorate();
    }
    
}
