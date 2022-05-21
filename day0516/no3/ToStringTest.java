package day0516.no3;

public class ToStringTest {
	
	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println(obj.toString());
		
		String name = new String("¿Ã∏ß");
		System.out.println(name.toString());
		
		System.out.println(name);
	}
	
}
