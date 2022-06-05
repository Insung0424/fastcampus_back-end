package ch13;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
	private TreeSet<Member> set;

	public MemberTreeSet() {
		set = new TreeSet<>();
	}
	
	public void addMember(Member member) {
		set.add(member);
	}
	
	public boolean removeMember(int memberId) {
		
		Iterator<Member> it = set.iterator();
		while(it.hasNext()) {
			Member member = it.next();
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				set.remove(member);
				return true;
			}
		}
		System.out.println(memberId+" does not exist");
		return false;
	}
	
	public void showAllMember() {
		for(Member m : set) {
			System.out.println(m);
		}
		System.out.println();
	}
	
	
}
