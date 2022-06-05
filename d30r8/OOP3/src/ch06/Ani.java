package ch06;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("a move");
	}
}
class Human extends Animal{

	@Override
	public void move() {
		System.out.println("h move");
	}
	public void readBook() {
		System.out.println(" h r");
	}
	
}

class Tiger extends Animal{

	@Override
	public void move() {
		System.out.println("t move");
	}
	public void hunting() {
		System.out.println(" t h");
	}
	
}

class Eagle extends Animal{

	@Override
	public void move() {
		System.out.println("E move");
	}
	public void flying() {
		System.out.println(" E f");
	}
	
}

public class Ani {
	public void moveAni(Animal animal) {
		animal.move();
	}

	public static void main(String[] args) {
		
		Animal h = new Human();
		Animal t = new Tiger();
		Animal e = new Eagle();
		
//		Ani test = new Ani();
//		test.moveAni(h);
//		test.moveAni(t);
//		test.moveAni(e);
		
		ArrayList<Animal> al = new ArrayList<>();
		al.add(h);
		al.add(t);
		al.add(e);
		
		for(Animal a:al) {
			a.move();
		}
	}

}
