package asssignmentcouchit;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;
public class Person {

	String name;
	int age;
	Person(String name, int age)
	{
	this.name=name;
	this.age=age;
	}
	public static void main(String[] args) {
	ArrayList <Person>person = new ArrayList<Person>();
	person.add(new Person("Akhil",21));
	person.add(new Person("Naveen", 25));
	person.add(new Person("Chandu",24));
	person.add(new Person("Venkatesh",21));
	person.add(new Person("Ameer",21));
	person.add(new Person("Rajashekar", 17));

	person.stream().filter(P -> P.age >18).collect(Collectors.toList()).forEach(Person ->System.out.print(Person.name+" "));
	}

}
