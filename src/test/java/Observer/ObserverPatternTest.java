/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kubas
 */
public class ObserverPatternTest {
    
    @Test
  public void testObserver() throws CloneNotSupportedException {

    Person person1 = new Person("Jakub");

    Sandwich regularSandwich = new Sandwich("Regular", "Mayonaisse", "Available");
    
    regularSandwich.registerObserver(person1);
    regularSandwich.setAvailability("not available");
    
    assertEquals(1, ((Person) person1).getSandwichName());

    regularSandwich.removeObserver(person1);
    regularSandwich.setAvailability("available");

    assertEquals(1, ((Person) person1).getSandwichName());
  }
    
}
