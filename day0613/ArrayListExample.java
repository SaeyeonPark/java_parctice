package day0613;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("spring");
		list.add("Network");
		list.add(2, "DataBase");
		list.add("OS");
		
		int size = list.size();
		System.out.println("ÃÑ °´Ã¼ ¼ö : " + size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2 : " + skill);
		System.out.println();
		
		int i = 0;
		for(String str : list) {
			System.out.println(i + ":" + str);
			i++;
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("Spring");
		
		for(i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
	}
	
}
