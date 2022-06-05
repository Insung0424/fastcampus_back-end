package ch13;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		MemberTreeSet arr = new MemberTreeSet();
		
		Member memberHong = new Member(1004, "홍길동");
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");
		arr.addMember(memberHong);
		arr.addMember(memberLee);
		arr.addMember(memberKim);
		arr.addMember(memberKang);

		arr.showAllMember();
		
//		TreeSet<String> ts = new TreeSet<>();
//		ts.add("이순신");
//		ts.add("김유신");
//		ts.add("홍길동");
//		ts.add("강감찬");
//		System.out.println(ts); //comparable이 자동으로 정렬해줌
	}

}
