package day0518.no4;

public class Car {
	int num;
	String name;
	
	public Car(int num, String name) {
		this.name = name;
		this.num = num;
	}
	
	void run() {
		System.out.println("�޸��ϴ�.");
	}
	
	void stop() {
		System.out.println("����ϴ�.");
	}
}
