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
public class Tests {
    public static void main(String args[]) {
        Emplo EconomicEmployer = new EconomicEmployer(
          1, "Economic Employer");
        Emplo MaintananceEmployer = new EconomicEmployer(
          2, "Financial department");
        Emplo MainRole = new MainRole(
          3, "Main Role");
 
        MainRole.addEmplo(EconomicEmployer);
        MainRole.addEmplo(MaintananceEmployer);
 
        MainRole.showEmploRole();
    }
}
