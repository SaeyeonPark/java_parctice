package day0530.no2;

import java.util.Arrays;

public class WildCardEx {
	public static void registerCourse( Course<?> course) { //모든 과정
		System.out.println(course.getName() + "수강생: "
				+ Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent( Course<? extends Student> course) {
		System.out.println(course.getName() + "수강생: "
				+ Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseWorker( Course<? super Worker> course) {
		System.out.println(course.getName() + "수강생: "
				+ Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("일반과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));	
		personCourse.add(new HighStudent("고등학생"));
		
		Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
		workerCourse.add(new Worker("직장인"));
		
		Course<Student> StudentCourse = new Course<Student>("학생과정", 5);
		StudentCourse.add(new Student("학생"));
		StudentCourse.add(new Student("고등학생"));
		
		Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생", 5);
		highStudentCourse.add(new HighStudent("고등학생"));
		
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
