package Suhang;

public class PoliceOffice extends Person{ // 경찰관

	public PoliceOffice(String name) {
		super(name);
	}
	
	public void survey() {
		System.out.println("조사하다.");
	}
	
	public void survey(String name) {
		System.out.println(name + "조사하다.");
	}
	
	@Override
	public void use() {
		System.out.println("경찰관이 사용하다.");
	}
	
}