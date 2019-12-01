package Adapter;


public class Test {
    public static void main(String args[]){  
        Employee targetInterface=new Pracownik();  
        targetInterface.giveDetails();  
        System.out.print(targetInterface.getName());  
    }
}
