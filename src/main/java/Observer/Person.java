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
public class Person implements Observer {

    String sandwichName;

    public Person(String sandwichName) {
        this.sandwichName = sandwichName;
    }

    public String getSandwichName() {
        return sandwichName;
    }

    public void setSandwichName(String personName) {
        this.sandwichName = sandwichName;
    }

    public void update(String availabiliy) {
        System.out.println("Witaj" + sandwichName);
    }
}
