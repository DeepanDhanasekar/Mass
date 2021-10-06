package org.bank;

public class CityBank extends AxisBank {
	
	public void saving() {
System.out.println("City saving intrest rate:7%");
 super.savings();
}
	public void deposit() {
System.out.println("City deposit intrest rate:11%");
super.deposite();

}
	private void fixed() {
System.out.println("City fixed intrest rate: 12%");
	}
	public static void main(String[] args) {
		CityBank c = new CityBank();
		c.saving();
		c.deposit();
		c.fixed();
	}
}
