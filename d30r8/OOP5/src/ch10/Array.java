package ch10;

import java.util.ArrayList;
import java.util.Iterator;

public class Array {
	private ArrayList<Member> List;

	public Array() {
		List = new ArrayList<>();
	}
	
	public Array(int size) {
		List = new ArrayList<>(size);
	}
	
	public void addMember(Member member) {
		List.add(member);
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
		
		Iterator<Member> it = List.iterator();
		while(it.hasNext()) {
			Member member = it.next();
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				List.remove(member);
				return true;
			}
		}
		System.out.println(memberId+" does not exist");
		return false;
	}
	
	public void showAllMember() {
		for(Member m : List) {
			System.out.println(m);
		}
		System.out.println();
	}
	
	
}
