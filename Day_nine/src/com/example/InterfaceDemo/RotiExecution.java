package com.example.InterfaceDemo;

public class RotiExecution implements MakeRoti,Roti {
	@Override
	public void recipe()
	{
		System.out.println("Take "+ingri+" and add some "+ingri3+"and add pinch of "+ingri2+" and mix well and make dough of it and make roti ");
	}
	
	@Override
	public void display()
	{
		System.out.println("Ingrident no 1 :"+ingri);
		System.out.println("Ingrident no 2 :"+ingri2);
		System.out.println("Ingrident no 3 :"+ingri3);
	}

}
