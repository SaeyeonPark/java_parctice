package day0613;

import java.util.*;

public class HashSetExample {
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("Spring");
		set.add("Setwork");
		set.add("Java");
		set.add("OS");
		
		int size = set.size();
		System.out.println("�� ��ü �� : " + size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("/t" + element);
		}
		set.remove("Spring");
		set.remove("OS");
		
		System.out.println("�� ��ü �� : " + set.size());
		
		iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("/t" + element);
		}
		
		set.clear();
		if(set.isEmpty() ) {
			System.out.println("��� ����");
		}
	}
	
}
