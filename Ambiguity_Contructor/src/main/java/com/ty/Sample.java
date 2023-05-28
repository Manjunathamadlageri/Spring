package com.ty;

public class Sample {
public Sample(double d1,double d2)
{
	System.out.println(d1);
	System.out.println(d2);
	
	System.out.println("Double arg const");
}
public Sample(int n1,int n2)
{
	System.out.println(n1);
	System.out.println(n2);
	System.out.println("Integer arg const");
}
public Sample(String s1,String s2)
{
	System.out.println("String arg const");
}
}
