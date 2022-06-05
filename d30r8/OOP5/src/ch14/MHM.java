package ch14;

import java.util.HashMap;
import java.util.Iterator;

public class MHM {
	private HashMap<Integer, Member> mhm;
	
	public MHM() {
		mhm = new HashMap<>();
	}
	
	public void addMember(Member member) {
		mhm.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if(mhm.containsKey(memberId)) {
			mhm.remove(memberId);
		}
		System.out.println("no element");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> it = mhm.keySet().iterator();
		
		while(it.hasNext()) {
			int key = it.next();
			Member member = mhm.get(key);
			System.out.println(member);
		}
	}
}
