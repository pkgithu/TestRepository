package sumu.sumu;

public class StringProgram {

	public static void main(String args[])
	{
		String s= "abc@def@ghi@JKL";
		String[] s1;
		s1=s.split("@");
		//S1=S.split("\\|");
		//s1=S.split("[0-9]");
		
		int l= s1.length;
		for(int i=0; i<l; i++)
		{
		  System.out.print(s1[i]+" ");	
		}
	}
}
