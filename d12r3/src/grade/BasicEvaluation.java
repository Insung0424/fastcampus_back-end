<<<<<<< HEAD
package grade;

public  class BasicEvaluation implements GradeEvaluation{

	@Override
	public String getGrade(int point) {
		//성적 구간마다 평가 점수 구분 if문 사용
		String grade;
		
		if(point >=90 && point <=100)
			grade = "A";
		else if(point >=80 && point <=89)
			grade = "B";
		else if(point >=70 && point <=79)
			grade = "C";
		else if(point >=55 && point <=69)
			grade = "D";
		else
			grade = "F";
		return grade;
	}
}

=======
package grade;

public  class BasicEvaluation implements GradeEvaluation{

	@Override
	public String getGrade(int point) {
		//성적 구간마다 평가 점수 구분 if문 사용
		String grade;
		
		if(point >=90 && point <=100)
			grade = "A";
		else if(point >=80 && point <=89)
			grade = "B";
		else if(point >=70 && point <=79)
			grade = "C";
		else if(point >=55 && point <=69)
			grade = "D";
		else
			grade = "F";
		return grade;
	}
}

>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
