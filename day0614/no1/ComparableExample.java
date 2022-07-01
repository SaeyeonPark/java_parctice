package day0614.no1;
import java.util.*;

public class ComparableExample {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("È«±æµ¿", 45));
		treeSet.add(new Person("±èÀÚ¹Ù", 25));
		treeSet.add(new Person("¹ÚÁö¿ø", 31));
		
		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + ":" + person.age);
		}
	}
}
