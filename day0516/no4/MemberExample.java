package day0516.no4;

public class MemberExample {
	
	public static void main(String[] args) {
		//���� ��ü ����
		Member original = new Member("blue", "ȫ�浿", "12345", 25, true);
		
		//���� ��ü�� ���� �Ŀ� �н����� ����
		Member cloned = original.getClass();
		cloned.password = "67890"; // ���� ��ü���� �н����� ����
		
		System.out.println("���� ��ü�� password: " + cloned.password);
		System.out.println("���� ��ü�� password: " + original.password);
	}
	
}
