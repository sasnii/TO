/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author kubas
 */
public class SandwichMaker {
    private Sandwich regular;
    private Sandwich premium;
    
    public SandwichMaker(){
        regular = new RegularSandwich();
        premium = new PremiumSandwich();
    }
    
    public void makeRegularSandwich(){
        regular.make();
    }
    
    public void makePremiumSandwich(){
        premium.make();
    }
}
