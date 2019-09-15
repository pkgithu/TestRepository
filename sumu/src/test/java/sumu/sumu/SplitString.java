package sumu.sumu;

import java.util.Scanner;

public class SplitString {

	public static void main(String args[])
	{
		//String s ="priyanka";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		String s1= "";
	
		
		int l= s.length();
		for(int i=0; i<l; i++)
		{
			s1=s1 + s.charAt(i);
			System.out.println(s1);
		}
	}
}
