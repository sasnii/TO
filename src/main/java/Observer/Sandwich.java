/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;

/**
 *
 * @author kubas
 */
public class Sandwich implements Interface {
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private String sandwichName;
    private String sandwichType;
    String availability;
    
	public Sandwich(String sandwichName, String sandwichType, String availability) {
		super();
		this.sandwichName = sandwichName;
		this.sandwichType = sandwichType;
		this.availability=availability;
	}
	
	public ArrayList<Observer> getObservers() {
		return observers;
	}
	public void setObservers(ArrayList<Observer> observers) {
		this.observers = observers;
	}
	public String getSandwichName() {
		return sandwichName;
	}
	public void setSandwichName(String sandwichName) {
		this.sandwichName = sandwichName;
	}
	public String getSandwichType() {
		return sandwichType;
	}
	public void setSandwichType(String sandwichType) {
		this.sandwichType = sandwichType;
	}
	
	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
		notifyObservers();
	}

	public void notifyObservers() {
            for(Observer ob : observers) {
                ob.update(this.availability);
            }
	}

	public void registerObserver(Observer observer) {
		 observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		 observers.remove(observer);
	}
}
