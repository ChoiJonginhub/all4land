package test;

import java.util.*;

public class Prototype {
	public static void main(String[] args) throws CloneNotSupportedException{
		Subjects subs = new Subjects();
        subs.loadData();

        Subjects s1 = (Subjects) subs.clone();
        Subjects s2 = (Subjects) subs.clone();

        List<String> list1 = s1.getSubList();
        list1.add("science");

        List<String> list2 = s2.getSubList();
        list2.remove("eng");

        System.out.println("subs: " + subs.getSubList());
        System.out.println("subs1: " + s1.getSubList());
        System.out.println("subs2: " + s2.getSubList());
	}
}
