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
public class FacadePattern {
      public static void main(String[] args) {
      SandwichMaker sandwichMaker = new SandwichMaker();

      sandwichMaker.makePremiumSandwich();
      sandwichMaker.makeRegularSandwich();		
   }
}
