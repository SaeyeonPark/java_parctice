package day0530.no1;

class A{
	void a() {
		System.out.println("a����");
	}
}

class B extends A {
	void b() {
		System.out.println("b����");
	}
}

public class Ex {
	
	public static <T extends A> void a(T t) {
		t.a();
		//t.b();
	}
	
	public static void main() {
		a(new A());
		a(new B());
	}
	
}
