package com.example.InterfaceDemo;

public interface Roti {
String ingri="Flour";
void recipe();
void display();

 default void flame()
 {
	 System.out.println("Turn on the Gas ! ");
 }
  static void container()
  {
	  System.out.println("Keep the vessel on the gas ");
  }
}
