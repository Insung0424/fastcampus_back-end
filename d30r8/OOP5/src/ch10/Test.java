package ch10;

public class Test {

	public static void main(String[] args) {
		Array arr = new Array();
		
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");
		Member memberHong = new Member(1004, "홍길동");
		
		arr.addMember(memberLee);
		arr.addMember(memberKim);
		arr.addMember(memberKang);
		arr.addMember(memberHong);

		arr.showAllMember();
		
		arr.removeMember(memberKim.getMemberId());
		arr.showAllMember();
	}

}
