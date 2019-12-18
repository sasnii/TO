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
public class User {
    public static void main(String[] args)    {
        Controller control = new Controller();
        TV tv = new TV();
        Command lightsOn = new TurnOnTV(tv);
        Command lightsOff = new TurnOffTV(tv);

        control.setCommand(lightsOn);
        control.press();

        control.setCommand(lightsOff);
        control.press();
  }
}
