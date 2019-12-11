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
public class Test {
    public static void main(String[] args){
        HugeObj object = new HugeObjProxy();
        object.fun();
        object.fun();
}
}
