package sumu.sumu;

import java.util.StringTokenizer;

public class StringToken {

	public static void main(String args[])
	{
		String str = "This#is####a###sample##java##code";

		//StringTokenizer token= new StringTokenizer(str);
		StringTokenizer token= new StringTokenizer(str,"#", false);

		while(token.hasMoreTokens())
		{
			System.out.println(token.nextToken());
		}

	}
}
