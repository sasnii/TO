/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flyweight;

import java.util.HashMap;

/**
 *
 * @author kubas
 */
public class SandwichFactory {
    public static final HashMap sandwichMap = new HashMap();

    public static Sandwich getSandwich(String dip){
        PremiumSandwich premSan = (PremiumSandwich)sandwichMap.get(dip);
        
        if(premSan==null){
            premSan = new PremiumSandwich(dip);
            sandwichMap.put(dip, premSan);
            System.out.println ("Make Premium Sandwich with " + dip + " dip.");   
        }
        return premSan;
    }
}
