<<<<<<< HEAD
package ch11;


public class Student {

	private String studentName;
	MyLogger myLogger = MyLogger.getLogger();
	
	public Student(String studentName){

		if(studentName == null){
		
			throw new StudentNameFormatException("name must not be null");
		}
		if( studentName.split(" ").length > 3)
			throw new StudentNameFormatException("이름이 너무 길어요");
		
		this.studentName = studentName;
	}

	
	public String getStudentName() {
		
		myLogger.fine("begin getStudentName()");
		
		return studentName;
	}
=======
package ch11;


public class Student {

	private String studentName;
	MyLogger myLogger = MyLogger.getLogger();
	
	public Student(String studentName){

		if(studentName == null){
		
			throw new StudentNameFormatException("name must not be null");
		}
		if( studentName.split(" ").length > 3)
			throw new StudentNameFormatException("이름이 너무 길어요");
		
		this.studentName = studentName;
	}

	
	public String getStudentName() {
		
		myLogger.fine("begin getStudentName()");
		
		return studentName;
	}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
}