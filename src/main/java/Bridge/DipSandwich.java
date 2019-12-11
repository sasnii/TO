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
public class DipSandwich extends Sandwich{
    public DipSandwich(Dip dip){
        super(dip);
    }
    
    public String make(){
        return "Made a sandwich " + dip.dipIt();
    }
}
