package day0516;

public class StringTest {

	public static void main(String[] args) {
		String str1 = "���ڿ�";
		String str2 = "���ڿ�";
		
		String str3 = new String("���ڿ�");
		String str4 = new String("���ڿ�");
		
		boolean result1 = str1.equals(str2); //���ڿ� ��(Object�� equals ������)
		System.out.println(result1);
		
		result1 = (str1 == str2);
		System.out.println(result1);
		
		boolean result2 = str3.equals(str4); //���ڿ� ��(Object�� equals ������)
		System.out.println(result1);
		
		result2 = (str3 == str4);
		System.out.println(result2);
	}
	
}
