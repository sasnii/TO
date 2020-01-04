/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

/**
 *
 * @author kubas
 */
public class Main {
    public static void main(String[] args) 
    {
        Type[] types = new Type[3];
        types[0] = new Type("typ1");
        types[1] = new Type("typ2");
        types[2] = new Type("typ3");

         
        List<Type> list = new TypeList(types);
         
        Iterator<Type> iterator = list.iterator();
         
        while(iterator.hasNext()) {
            Type current = iterator.next();
            System.out.println(current.getName());
        }
    }
}
