package ch18;

public class CompanyTest {

	public static void main(String[] args) {
		Company company = Company.getInstance();
		Company company2 = Company.getInstance();
		//단하나의 객체만 생성되는 싱글톤 패턴
		System.out.println(company); //ch18.Company@1c4af82c
		System.out.println(company2);//ch18.Company@1c4af82c
		
	}

}
