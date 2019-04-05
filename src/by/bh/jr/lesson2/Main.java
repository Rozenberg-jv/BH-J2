package by.bh.jr.lesson2;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();

		list.add("2");
		list.add("1");
		list.add(1,"3");
		String s = list.get(2);

		System.out.println(list);
		System.out.println(s);
	}

}