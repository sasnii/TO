package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Students implements Cloneable{

	private List<String> empList;
	
	public Students(){
		empList = new ArrayList<String>();
	}
	
	public Students(List<String> list){
		this.empList=list;
	}
	public void loadData(){
		empList.add("Pankaj");
		empList.add("Raj");
		empList.add("David");
		empList.add("Lisa");
	}
	
	public List<String> getEmpList() {
		return empList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
			List<String> temp = new ArrayList<String>();
			for(String s : this.getEmpList()){
				temp.add(s);
                             
			}
			return new Students(temp);
	}
	
}