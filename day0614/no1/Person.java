package day0614.no1;
import java.util.*;

public class Person {
	public String name;
	public int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Person o) {
		if(age > o.age) return 1;
		else if(age == o.age) return 0;
		else return -1;
	}
}
