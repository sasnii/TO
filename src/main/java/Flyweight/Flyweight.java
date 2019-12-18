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
public class Flyweight {
    private static final String dips[] = { "Garlic", "Mustard", "Ketchup", "Mayonaisse", "Ranch" };
       public static void main(String[] args) {
 
          for(int i=0; i < 20; ++i) {
             PremiumSandwich premSan = (PremiumSandwich)SandwichFactory.getSandwich(getRandomDip());
              
             premSan.make();
          }
       }
       private static String getRandomDip() {
          return dips[(int)(Math.random()*dips.length)];
       }
}
