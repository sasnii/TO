/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author kubas
 */
public class Pracownik extends Employer implements Employee{
    public void giveDetails(){  
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
    try{
    System.out.print("Wprowadz imie");  
    String names=br.readLine();  
    System.out.print("\n");  

    System.out.print("Wprowadz pensje");  
    long penssion=Long.parseLong(br.readLine());  
    System.out.print("\n");  

    setName(names);  
    setPensja(penssion);  
    }
    catch(Exception e){
        System.out.print(e);
    }
}
   public String getPracownik() {  
   long penssion=getPensja();  
   String names=getName();  
   
   return ("Pracownik roku: " + names + " z pensją: " +  penssion );
   
   }
}