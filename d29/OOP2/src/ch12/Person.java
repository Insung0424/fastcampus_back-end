package ch12;

public class Person {
	String name;
	int age;
	
	public Person() {
		this("no name",1);
	}
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public void showPerson() {
		System.out.println(name + "," + age);
	}
	
	public Person getPerson() {
		return this;
	}
	public static void main(String[] ags) {
		Person person = new Person();
		person.showPerson();
		System.out.println(person);
		
		Person person2 = new Person();
		System.out.println(person2.getPerson());
	}
}


