/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

/**
 *
 * @author kubas
 */
public class TurnOnTV implements Command{
    TV tv;
    public TurnOnTV(TV tv){
        this.tv = tv;
    }
    
    @Override
    public void execute(){
        tv.switchOn();
    }
}
