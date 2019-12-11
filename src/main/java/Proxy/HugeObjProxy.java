/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

/**
 *
 * @author kubas
 */
public class HugeObjProxy implements HugeObj{
    private static HugeObj object;
    
    @Override
    public void fun(){
        if(object==null){
            object= new HugeObjImpl();
        }
        object.fun();
    }
}

