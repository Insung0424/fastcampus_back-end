package ch08;

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
	
	public void down(ArrayList<Animal> list) {
		for(int i=0;i<list.size();i++) {
			Animal animal = list.get(i);
			if(animal instanceof Human) {
				Human h = (Human)animal;
				h.readBook();
			}
			else if(animal instanceof Tiger) {
				Tiger t = (Tiger)animal;
				t.hunting();
			}
			else if(animal instanceof Eagle) {
				Eagle e = (Eagle)animal;
				e.flying();
			}
			else {
				System.out.println("none");
			}
			
		}
	}

	public static void main(String[] args) {
		
		Animal h = new Human();
		Animal t = new Tiger();
		Animal e = new Eagle();
		
		Ani test = new Ani();
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
		
		test.down(al);
//		 h r
//		 t h
//		 E f
	}

}
