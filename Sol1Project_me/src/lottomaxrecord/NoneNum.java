package lottomaxrecord;

import java.util.ArrayList;

public class NoneNum{
	private String none = "";
	
	public NoneNum(ArrayList<Integer> nlist){
        
        int narr[]=new int[46];
        for(int i=1;i<narr.length;i++) {
        	narr[i]=i;
        }
        
        for(int j=1;j<narr.length;j++) {
        	if(nlist.contains(j)) {
        		continue;
        	}
        	else {
        		none+=" ";
        		none+=j;
        		none+=" ";
        	}
        }
	}
	
	public String getNoneNum() {
		return none;
	}
}
