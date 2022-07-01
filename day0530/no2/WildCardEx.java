package day0530.no2;

import java.util.Arrays;

public class WildCardEx {
	public static void registerCourse( Course<?> course) { //��� ����
		System.out.println(course.getName() + "������: "
				+ Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent( Course<? extends Student> course) {
		System.out.println(course.getName() + "������: "
				+ Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseWorker( Course<? super Worker> course) {
		System.out.println(course.getName() + "������: "
				+ Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("�Ϲݰ���", 5);
		personCourse.add(new Person("�Ϲ���"));
		personCourse.add(new Worker("������"));
		personCourse.add(new Student("�л�"));	
		personCourse.add(new HighStudent("����л�"));
		
		Course<Worker> workerCourse = new Course<Worker>("�����ΰ���", 5);
		workerCourse.add(new Worker("������"));
		
		Course<Student> StudentCourse = new Course<Student>("�л�����", 5);
		StudentCourse.add(new Student("�л�"));
		StudentCourse.add(new Student("����л�"));
		
		Course<HighStudent> highStudentCourse = new Course<HighStudent>("����л�", 5);
		highStudentCourse.add(new HighStudent("����л�"));
		
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(StudentCourse);
		registerCourse(highStudentCourse);
		System.out.println();
		
		registerCourseStudent(StudentCourse);
		registerCourseStudent(highStudentCourse);
		System.out.println();
		
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
		System.out.println();
	}
}
