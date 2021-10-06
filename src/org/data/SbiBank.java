package org.data;

public class SbiBank implements HdfcBank   {

	@Override
	public void saving() {
		System.out.println("SbiBank saving 8%");		
	}

	@Override
	public void deposit() {
System.out.println("SbiBank deposit");		
	}

	@Override
	public void fixed() {
System.out.println("SbiBank fixed");		
	}
	public static void main(String[] args) {
		SbiBank s = new SbiBank();
		s.saving();
		s.deposit();
		s.fixed();
	}

}
