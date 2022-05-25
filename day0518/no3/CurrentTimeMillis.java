package day0518.no3;

public class CurrentTimeMillis {
	public static void main(String[] args) {
		long time1 = System.currentTimeMillis();
		long t1 = System.nanoTime();
		
		int sum = 0;
		for(int i = 0; i <= 1000000; i++) {
			sum += i;
		}
		
		long time2 = System.currentTimeMillis();
		long t2 = System.nanoTime();
		
		System.out.println("1~1000000������ �� : " + sum);
		System.out.println("��꿡 " + (time2-time1) + "�и��ʰ� �ҿ�Ǿ����ϴ�.");
		System.out.println("��꿡 " + (t1+t2) + "�����ʰ� �ҿ�Ǿ����ϴ�.");
	}
}
