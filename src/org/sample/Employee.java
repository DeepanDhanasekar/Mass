package org.sample;

public class Employee {

	private void employeeinfo(String name) {
		System.out.println(name);
	}
	
	private void employeeinfo(String email,int empid,float salary) {
System.out.println("my email is:"+email+"/n"+"Employeeid:"+empid+"/n"+"my salary:"+salary);
	}
	private void employeeinfo(float salary) {
System.out.println("my salary:"+salary);
	}
	private void employeeinfo(int mobile) {
System.out.println("my mobile:"+mobile);
	}
	private void employeeinfo(long lanline,char grad) {
System.out.println("my lanline:"+lanline+"/t"+"my grad:"+grad);
	}
	private void employeeinfo(char blockname,int lanline) {
System.out.println("my blockname:"+blockname+"my lanline:"+lanline);
	}
	private void mani() {
Employee p  = new Employee();
p.employeeinfo("DS");
p.employeeinfo("deepan2104d@gmail.com",123456788,3838.88f);
p.employeeinfo(2345.23f);
p.employeeinfo(56743287);
p.employeeinfo(5777986768l, 'B');
p.employeeinfo('D', 688787878);
	}
	 
	
	
	
	
	
	
	
	
	
	
	
}
