package sumu.sumu;

import java.util.Scanner;

public class Matrix {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i;
		int j;
		System.out.println("Enter row and column");
		int c =sc.nextInt();
		int r= sc.nextInt();
		int arr[][]=new int[c][r];
		//System.out.println("Enter Matrix");
		for(i=0; i<c; i++)
		{
			for(j=0; j<r; j++)
			{
				//arr[i][j]=sc.nextInt();
				arr[i][j] = i+j;
				System.out.print(arr[i][j] + " ");
				}
			System.out.println();
			
		}
	System.out.println("array after transpose");
	int[][] arr1 = new int[r][c];
		for(i=0; i<r; i++)
		{
			for(j=0; j<c; j++)
				
			{	arr1[i][j] = arr[j][i];
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}
   
}
