package org.tns.UncheckedException;
import java.util.*;
public class LoginExecutor {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String email=sc.next();
		String password=sc.next();

		System.out.println(password+" "+email);
		try {
		if(email.equals("ankupagar@gmail.com") && password.equals("Pass@123"))
		{
			System.out.println("Login Successfully !!");
		}
		else
		{
			throw new LoginCredential("Invalid Credential please Enter the Correct email and Password");
		}
		}
		catch(LoginCredential e)
		{
			System.out.println(" 14785239696 "+e);
		}
		sc.close();
	}

}
