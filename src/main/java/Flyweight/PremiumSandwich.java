/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flyweight;

/**
 *
 * @author kubas
 */
public class PremiumSandwich implements Sandwich{
    private String dip;
    
    public PremiumSandwich(String dip){
        this.dip  = dip;
    }
    
    @Override
    public void make(){
        System.out.println("Make premium sandwich with " + dip + " dip");
    }
}
