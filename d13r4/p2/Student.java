<<<<<<< HEAD
package p2;

import java.util.ArrayList;

public class Student {

	private int studentId;
	private String studentName;
		
	private ArrayList<Subject> subjectList;
		
		public Student(int studentId, String studentName) {
			this.studentId = studentId;
			this.studentName = studentName;
			
			subjectList = new ArrayList<>();
		}

		public void addSubject(String subjectid, int subjectPoint) {
			Subject subject = new Subject();
			subject.setSubjectName(subjectid);
			subject.setSubjectScore(subjectPoint);
			
			subjectList.add(subject);
		}
		
		public void showStudentInfo() {
			int total = 0;
			for(Subject s : subjectList) {
				System.out.println(studentId + s.getSubjectScore());
			}
			System.out.println(studentId + total);
		}
}
=======
package p2;

import java.util.ArrayList;

public class Student {

	private int studentId;
	private String studentName;
		
	private ArrayList<Subject> subjectList;
		
		public Student(int studentId, String studentName) {
			this.studentId = studentId;
			this.studentName = studentName;
			
			subjectList = new ArrayList<>();
		}

		public void addSubject(String subjectid, int subjectPoint) {
			Subject subject = new Subject();
			subject.setSubjectName(subjectid);
			subject.setSubjectScore(subjectPoint);
			
			subjectList.add(subject);
		}
		
		public void showStudentInfo() {
			int total = 0;
			for(Subject s : subjectList) {
				System.out.println(studentId + s.getSubjectScore());
			}
			System.out.println(studentId + total);
		}
}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
