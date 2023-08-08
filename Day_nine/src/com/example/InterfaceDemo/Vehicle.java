package com.example.InterfaceDemo;

public class Vehicle extends Car{
	 public void cal(int m,int n)
	{
		m=m+20+n;
		System.out.println(m);
	}
public static void main(String args[])
{

	Vehicle v=new Vehicle();

v.cal(120,45);
}
}
