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
public interface Iterator <E> {
    void reset();
    E next();
    E current();
    boolean hasNext();
}
