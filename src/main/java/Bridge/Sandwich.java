/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge;

/**
 *
 * @author kubas
 */
public abstract class Sandwich {
    protected Dip dip;
    
    public Sandwich (Dip dip){
        this.dip = dip;
    }
    
    abstract public String make();
}
