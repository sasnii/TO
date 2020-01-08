/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

/**
 *
 * @author kubas
 */
public class Choices {
    private Strategy strategy;
    
    public Choices(Strategy strategy){
      this.strategy = strategy;
   }

   public int executeStrategy(int a, int b){
      return strategy.calcIt(a, b);
   }
}
