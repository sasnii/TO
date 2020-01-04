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
public class TypeList implements List<Type> {
    private Type[] types;
     
    public TypeList(Type[] types)
    {
        this.types = types;
    }
     
    @Override
    public Iterator<Type> iterator() {
        return new TypeIterator(types);
    }
}
