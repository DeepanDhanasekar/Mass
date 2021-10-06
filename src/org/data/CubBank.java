package org.data;

public class CubBank extends AxisBank {

	@Override
	public void saving() {
System.out.println("CubBank saving 8%");		
	}

	@Override
	public void deposit() {
System.out.println("CubBank");		
	}
	public static void main(String[] args) {
		CubBank s = new CubBank();
		s.saving();
        s.deposit();	
	    s.fixed();
	
	
	}
	

}
