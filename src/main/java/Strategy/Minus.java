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
public class Minus implements Strategy{
    public int calcIt(int a, int b){
        return a - b;
    }
}
