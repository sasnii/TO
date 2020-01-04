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
public class TypeIterator implements Iterator <Type> {
    private Type[] types;
    private int position;
     
    public TypeIterator(Type[] types)
    {
        this.types = types;
        position = 0;
    }
 
    @Override
    public void reset() {
        position = 0;
    }
 
    @Override
    public Type next() { 
        return types[position++];
    }
 
    @Override
    public Type current() {
        return types[position];
    }
 
    @Override
    public boolean hasNext() {
        if(position >= types.length)
            return false;
        return true;
    }
}
