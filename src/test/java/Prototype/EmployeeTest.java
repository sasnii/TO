package Prototype;

import java.util.List;

public class EmployeeTest {
    
   	public static void main(String[] args) throws CloneNotSupportedException {
		Students study = new Students();
		study.loadData();
	
		Students std1 = (Students) study.clone();
		Students std12 = (Students) study.clone();
		List<String> list = std1.getstudentsList();
		list.add("Ania");
		List<String> list1 = std12.getstudentsList();
		list1.remove("Jakub");
		
		System.out.println("emps List: "+study.getstudentsList());
		System.out.println("empsNew List: "+list);
		System.out.println("empsNew1 List: "+list1);
	}
    
}
