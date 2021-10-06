package org.sample;

import org.base.Employee;

public class Client extends Employee  {//child
private void clientid() {
	System.out.println(" Client id is:8758");
}
private void clientname() {
	System.out.println(" Client name is:mass");
}public static void main(String[] args) {
	 Client p = new  Client();
	 p.clientid();
	 p.clientname();
	
	 p.empid();
	 p.empname();
}
}
