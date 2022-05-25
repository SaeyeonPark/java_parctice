package day0518.no3;

public class GetenvTest {
	
	public static void main(String[] args) {
		String name = System.getenv("OS");
		System.out.println("OS : " + name);
		
		String name2 = System.getenv("Path");
		System.out.println("Path : " + name2);
	}
	
}
