package Game;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		
		Game g=new Game();
		
		Scanner s=new Scanner(System.in);
		
		while(true) {
			System.out.println("무작위 이름이 나오면 그 이름이 가지고 있는 수를 맞히는 게임");
			System.out.println("수의 범위는 1~10 입니다");
			System.out.println("1 : 이름 추가");
			System.out.println("2 : 게임 시작");
			System.out.println("3 : 이름 삭제");
			System.out.println("4 : 게임 종료");
			
			int choose = s.nextInt();
			switch(choose) {
			case 1:
				g.in();
				break;
			case 2 :
				g.out();
				break;
			case 3:
				g.delete();
				break;	
			case 4:
				g.end();
				break;
			}		
		}	
		
	}
	
}

class Game{
	
	Scanner sc = new Scanner(System.in);
	
	ArrayList<Person> ary = new ArrayList<Person>();
	// ArrayList 에 Person 으로 객체 배열생성
	
	Game(){// Game 객체 생성과 동시에 ArrayList에 Person객체 4개 추가
		ary.add(new Person("Tom",(int)(Math.random()*10+1)));
		ary.add(new Person("James",(int)(Math.random()*10+1)));
		ary.add(new Person("Bob",(int)(Math.random()*10+1)));
		ary.add(new Person("Eden",(int)(Math.random()*10+1)));
	}
	
	void in() { // ArrayList에 Person 객체를 추가하기 위한 함수
		while(true) {
			System.out.println("이름을 추가 합니다. 추가할 이름을 입력해주세요");
			System.out.println("취소 또는 메뉴로 돌아가기는 'stop'을 입력해주세요");
			
			String name = sc.next();
			if(name.equals("stop")) { // stop 입력받으면 in() 을 탈출
				break;
			}
			
			Person p = new Person(name,(int)(Math.random()*10+1));
			// 새로운 Person 객체p 를 생성 (입력받은 name, 1~10사이의 수)
			
			if(ary.size() == 5) { 
				// 배열 크기를 5를 넘지못하게 하기위해 리스트에 추가하지않고 탈출
				System.out.println("더 이상 추가할 수 없습니다");
				break;
			}
			
			if(ary.contains(p)) { 
				// 새로 생성한 객체p 와 동일한 객체가 리스트에 있는지 확인
				System.out.println("이미 있는 이름입니다");
			}
			else {
				// 리스트에 없으면 객체p 추가
				ary.add(p);
				System.out.println("이름 추가 완료");
			}
		}
	}
	
	void out() {
		
		ArrayList<Person> copyarr = ary;
		/*
		 * 답을 모두 맞혔을 경우 메뉴로 돌아가기위해 필요한 복사된객체리스트
		 * 
		 * out() 함수 바깥에서 복사된리스트를 작성시 in(),delete()로 인한
		 * 리스트의 추가,삭제를 반영하기 위해 얕은 복사를 해야할 듯?
		 * 지금은 그냥 out()이 시작되는 순간 생성되게 구성함 짧아서
		 */
		
		while(true) {
			Random r = new Random(); //랜덤 범위 수 생성을 위한 객체
			int n = r.nextInt(ary.size()); 
			//r.nextInt(범위는 리스트의 크기보다 작게) 
			
			Person p = ary.get(n); //리스트에서 n번째 객체p 가져오기
			String name = p.getName(); //객체p의 이름 저장
			
			while(true) {
				// 틀렸을 때 다른 이름으로 넘어가지않고 
				//계속 도전하기위해 while(true) 안에서 구현
			
				System.out.println(name + " 가 가지고 있는 수는?");
				int id = p.getId(); //객체p의 수 저장
				
				System.out.println("답을 입력해주세요");
				System.out.println("메뉴로 돌아가기는 '-1'을 입력해주세요");
				int i = sc.nextInt();
				
				if(i == -1) { 
					return; // while탈출이 아닌 out()함수 종료
				}
				if(i == p.getId()) { 
				// 입력받은 i 와 객체p의 수 비교
					
//					if(copyarr.get(n).getName().equals(p.getName())) {
					if(p.getName().equals(copyarr.get(n).getName())) {
						copyarr.remove(n);
						// 문제로 나온 이름과 복사된 객체리스트에서 가져온 
						// N번째의 이름이 같다면 복사한리스트의 N번째를 삭제 
					}
					
					System.out.println("정답");
					break;
				}
				else {
					System.out.println("틀렸습니다");
				}
			}
			
// 			리스트안에 이름들이 가지고 있는 수를 모두 맞혔을 경우 탈출
			if(copyarr.isEmpty()) {
			// 복사된리스트의 안에 있던 값들이 모두 삭제되었다면 while(true)종료
				System.out.println("모두 맞았습니다");
				break;
			}
			
		}
			
	}
	
	void delete() { //Person 객체 중 선택해서 삭제를 위한 함수
		System.out.println("어떤 이름을 삭제할까요?");
		for(int a=0;a<ary.size();a++) {
			System.out.print(ary.get(a).getName()+" ");
						//리스트에 a번째객체의 이름 출력
		}
		
		System.out.println("이 중에서 삭제할 이름을 입력해주세요");
		System.out.println("메뉴로 돌아가기는 'stop'을 입력해주세요");
		String name = sc.next();
		
		for(int a=0;a<ary.size();a++) {
//			String copy = ary.get(a).getName();
			if(name.equals("stop")) {
				return;
			}
			
			if(name.equals(ary.get(a).getName())) {
				ary.remove(a); 
				System.out.println("삭제되었습니다");
			}
		}
	}
	
	
	void end() {
		System.out.println("게임을 종료합니다");
		System.exit(0);
	}
	
}

class Person{
	private String name;
	private int id;
	
	public Person(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}

	@Override
	public boolean equals(Object obj) { 
		// Game 의 in() 함수에서 새로 생성한 객체p 와 
		// 동일한 객체가 리스트에 있는지 확인하기 위해 재정의
		Person p = (Person)obj;
		if(p.getId() == this.getId() 
				&& 
				p.getName().equals(this.name)) {
			return true;
		}
		return false;
	}
	
}
