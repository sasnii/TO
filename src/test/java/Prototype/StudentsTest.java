package Prototype;

import java.util.List;

public class StudentsTest {
    
   	public static void main(String[] args) throws CloneNotSupportedException {
		Students study = new Students();
		study.loadData();
	
		Students std1 = (Students) study.clone();
		Students std12 = (Students) study.clone();
		List<String> list = std1.getstudentsList();
		list.add("Ania");
		List<String> list1 = std12.getstudentsList();
		list1.remove("Jakub");
		
		System.out.println("List: "+study.getstudentsList());
		System.out.println("std1 List: "+list);
		System.out.println("std12 List: "+list1);
	}
    
}
