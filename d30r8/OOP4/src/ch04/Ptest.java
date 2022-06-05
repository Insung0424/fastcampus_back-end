package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Ptest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class c= Class.forName("ch04.Person");
		Person person = (Person) c.newInstance();
		person.setName("Lee");
		System.out.println(person);
		
		Class c1 = person.getClass();//이미 인스턴트가 있는 상태만 가능
		Person p = (Person) c1.newInstance();
		System.out.println(p);
		
		Class[] para = {String.class};
		Constructor cons = c1.getConstructor(para);
		
		Object[] ar = {"kim"};
		Person Lee = (Person) cons.newInstance(ar);
		System.out.println(Lee);
	}

}
