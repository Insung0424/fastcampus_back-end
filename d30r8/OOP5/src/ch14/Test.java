package ch14;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		MHM arr = new MHM();
		
		Member memberHong = new Member(1004, "홍길동");
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");
		arr.addMember(memberHong);
		arr.addMember(memberLee);
		arr.addMember(memberKim);
		arr.addMember(memberKang);

		arr.showAllMember();
		System.out.println();
		
		HashMap<Integer,String> hashMap = new HashMap<>();
		hashMap.put(1004, "홍길동");
		hashMap.put(1001, "이순신");
		hashMap.put(1002, "김유신");
		hashMap.put(1003, "강감찬");
		
		System.out.println(hashMap);
	}

}
