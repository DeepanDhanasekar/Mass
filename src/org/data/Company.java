package org.data;

import java.util.Scanner;

public class Company {
public static void main(String[] args) {
	//scanner refname = new scanner(string.in);
	Scanner s = new Scanner(System.in);
byte age = s.nextByte();
System.out.println(age);
float salary = s.nextFloat();
System.out.println(salary);
int lanline = s.nextInt();
System.out.println("my lanline :"+lanline);
long mobile = s.nextLong();
System.out.println(mobile);
double DS = s.nextDouble();
System.out.println("my l :"+ DS);
short atm = s.nextShort();
System.out.println(atm);
boolean DSL = s.nextBoolean();
System.out.println("my l:"+ DSL);
}
}

