package org.main;

public class memory {
	public static void main(String[] args) {
		System.out.println("Literal String");
		
		String s = "java";
		System.out.println(s);
		int d = System.identityHashCode(s);
		System.out.println(d);
		
		String s1 = "java";
		System.out.println(s1);
		int e = System.identityHashCode(s1);
		System.out.println(e);
		
		String s2 ="Java";
		System.out.println(s2);
		int e2 = System.identityHashCode(s2);
		System.out.println(e2);
		
		System.out.println("***********");
		System.out.println("non literal String");
		
		String ns = new String("selenium");
		System.out.println(ns);
		int p = System.identityHashCode(ns);
		System.out.println(p);
		
		String ns2 = new String("selenium");
		System.out.println(ns2);
		int a = System.identityHashCode(ns2);
		System.out.println(a);
		
		String ns3 =new String("selenimu");
		System.out.println(ns3);
		int n = System.identityHashCode(ns3);
		System.out.println(ns3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
