package org.base;

public class Company extends Employee {//child1
	public void comid() {
System.out.println("Company id is:5667");
}
	public void comname() {
System.out.println("Company name is:green");
}
	public static void main(String[] args) {
		Company c = new Company();
		c.comid();
		c.comname();
		c.empid();
		c.empname();
	}

}
