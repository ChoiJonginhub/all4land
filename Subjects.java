package test;

import java.util.*;

public class Subjects implements Cloneable {
	private List<String> subList;
	public Subjects() {
		subList=new ArrayList<>();
	}
	public Subjects(List<String> list) {
		this.subList=list;
	}
	public List<String> getSubList() {
		return subList;
	}
	public void setSubList(List<String> subList) {
		this.subList = subList;
	}
	public void loadData() {
		subList.add("kor");
		subList.add("eng");
		subList.add("math");
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		List<String> temp = new ArrayList<>();
		for(String str:this.subList) {
			temp.add(str);
		}
		return new Subjects(temp);
	}
}
