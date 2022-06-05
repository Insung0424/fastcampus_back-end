package ch12;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	private HashSet<Member> set;

	public MemberHashSet() {
		set = new HashSet<>();
	}
	
	public void addMember(Member member) {
		set.add(member);
	}
	
	public boolean removeMember(int memberId) {
		/*for(int i=0; i<List.size(); i++) {
			Member member = List.get(i);
			
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				List.remove(i);
				return true;
			}
		}*/
		
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
