package com.java.assign;
import java.util.*;
public class RevOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size=sc.nextInt();
		boolean result=true;
		int a[]=new int[size];
		int b[]=new int[size];
		//value by Pinky
		System.out.println("Enter the array ");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		
		//value by mary
		System.out.println("Enter the second array ");
		for(int i=0;i<size;i++)
		{
			b[i]=sc.nextInt();
		}
		
		//for checking the reverse order is correct or not
		for(int i=0,j=size-1;j>0||i<size;i++,j--)
		{
			System.out.print(" "+a[j]+"\t"+b[i]);
			if(a[j]!=b[i])
			{
				result=false;
			}
			System.out.println();
		}
	
		if(result)
		{
			System.out.println("Yes,its is in reverse order");
		}
		else
		{
			System.out.println("No, its is not in reverse order");
		}

	}
}
