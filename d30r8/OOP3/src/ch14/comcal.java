package ch14;

public class comcal extends Claculator{

	@Override
	public int times(int n1, int n2) {
		return n1*n2;
	}

	@Override
	public int divide(int n1, int n2) {
		if(n2 == 0) {
			return ERROR;
		}
		return n1/n2;
	}

	@Override
	public void des() {
		
		System.out.println("com over");
	}

	
}
