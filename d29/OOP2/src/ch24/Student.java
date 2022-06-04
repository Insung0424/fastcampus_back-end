package ch24;

import java.util.ArrayList;


public class Student {
	int id;
	String name;
	ArrayList<Subject> subjectList;
	public Student(int id,String name) {
		this.id=id;
		this.name=name;
		
		subjectList = new ArrayList<>();
	}
	
	public void addSubject(String n,int s) {
		Subject subject = new Subject();
		subject.setName(n);
		subject.setScore(s);
		
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total=0;
		for(Subject s:subjectList) {
			total+=s.getScore();
			System.out.println(name+" "+s.getName()+" "+s.getScore());
		}
		System.out.println(name+" "+total);
	}
}
