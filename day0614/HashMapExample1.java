package day0614;

import java.util.*;

public class HashMapExample1 {

	public static void main(String[] args) {
		//Map ����
		map<String Iterator> map = new HashMap<String, Integer>();
		
		//��ü ����
		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);
		map.put("�ڹ�Ŵ", 80);
		map.put("ȫ�浿", 95);
		
		System.out.println("�� Entry �� : " + map.size());
		
		//��ü ã��
		System.out.println("/tȫ�浿 : " + map.get("ȫ�浿"));
		System.out.println();
		
		//��ü�� �ϳ��� ó��
		Set<String> KeySet = map.keySet();
		Iterator<String> keyIterator = KeySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("/t" + key + ":" + value);
		}
		System.out.println();
		
		//��ü ����
		map.remove("ȫ�浿");
		System.out.println("�� Entry �� : " + map.size());
		
		//��ü�� �ϳ��� ó��
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = 
				entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("/t" + key + ":" + value);
		}
		System.out.println();
		
		//��ü ��ü ����
		map.clear();
		System.out.println("�� Entry �� : " + map.size());
	}
	
}
