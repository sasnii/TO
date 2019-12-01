package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Students implements Cloneable{

	private List<String> studentsList;
	
	public Students(){
		studentsList = new ArrayList<String>();
	}
	
	public Students(List<String> list){
		this.studentsList=list;
	}
    
	public void loadData(){
		studentsList.add("Jakub");
		studentsList.add("Adrian");
		studentsList.add("Maciej");
	}
	
	public List<String> getstudentsList() {
		return studentsList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
			List<String> temp = new ArrayList<String>();
			for(String s : this.getstudentsList()){
				temp.add(s);     
			}
			return new Students(temp);
	}
}