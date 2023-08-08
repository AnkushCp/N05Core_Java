package com.practice.array;
public class ArrayObject {
public static void main(String args[])
{
	//create a array object of employee
	Employee e[]=new Employee[2];
	// Initialized the constructor with parameters
	e[0]=new Employee(101,"Ankush",4500.30);
	e[1]=new Employee(105,"Ella",3500.20);
	
	//get the output from that return from Employee
	for(int i=0;i<e.length;i++)
	{
		System.out.println(e[i].getId()+"  "+e[i].getName()+"  "+e[i].getSal());
	}
	
}
}