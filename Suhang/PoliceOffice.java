package Suhang;

public class PoliceOffice extends Person{ // ������

	public PoliceOffice(String name) {
		super(name);
	}
	
	public void survey() {
		System.out.println("�����ϴ�.");
	}
	
	public void survey(String name) {
		System.out.println(name + "�����ϴ�.");
	}
	
	@Override
	public void use() {
		System.out.println("�������� ����ϴ�.");
	}
	
}