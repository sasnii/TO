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
public class RegularSandwich implements Sandwich{
    @Override
    public void make(){
        System.out.println("make() from RegularSandwich");
    }
}

