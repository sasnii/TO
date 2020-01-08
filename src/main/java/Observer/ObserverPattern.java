/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author kubas
 */
public class ObserverPattern {

    public static void main(String[] args) {
        Person person1 = new Person("Jakub");
        Person person2 = new Person("Maciej");

        Sandwich regularSandwich = new Sandwich("Regular", "Mayonaisse", "Available");

        regularSandwich.registerObserver(person1);
        regularSandwich.registerObserver(person2);

        regularSandwich.setAvailability("not available");
    }
}
