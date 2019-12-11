/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author kubas
 */
public class MaintananceEmployer implements Emplo {
    private Integer id;
    private String name;
    
    public MaintananceEmployer(Integer id, String name){
        this.id = id; 
        this.name = name;
    }
    
    @Override
    public void showEmploRole(){
        System.out.println(getClass().getSimpleName());
    }
    
     public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
