/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kubas
 */
public abstract class MainRole implements Emplo {
    private Integer id;
    private String name;
 
    private List<Emplo> childEmplo;
 
    public MainRole(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.childEmplo = new ArrayList<>();
    }
 
    public void printDepartmentName() {
        childEmplo.forEach(Emplo::showEmploRole);
    }
 
    public void addEmplo(Emplo emplo) {
        childEmplo.add(emplo);
    }
 
    public void removeEmplo(Emplo emplo) {
        childEmplo.remove(emplo);
    }
}
