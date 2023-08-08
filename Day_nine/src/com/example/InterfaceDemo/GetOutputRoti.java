package com.example.InterfaceDemo;

public class GetOutputRoti extends RotiExecution {
	public static void main(String args[])
	{
		 RotiExecution r=new  RotiExecution();
		 r.flame();   //default method
		 Roti.container(); //static method
		 r.display();  //Abstract method
		 r.recipe();    //Abstract method
	}
}
