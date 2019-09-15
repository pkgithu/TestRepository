package sumu.sumu;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String output = "";
		String a = sc.nextLine();
		//System.out.println(a);
		
		for(int i = a.length() - 1 ; i >= 0 ; i--)
		{
			char b = a.charAt(i);
			 output = output + b;
		}
		
		System.out.println(output);
	}

}
