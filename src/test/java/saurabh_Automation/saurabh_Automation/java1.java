package saurabh_Automation.saurabh_Automation;

import java.util.Scanner;

public class java1 
{
	public static void main(String[] args) 
	{
		factorial(5);
		reverse();
		 alphabet();
	}

	
	public static void factorial(int k)
	{
	
		int fact=1;
		for(int i = 1;i<=k;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	
	public static void reverse()
	{
		int n;int k = 0;
		Scanner sc=new Scanner(System.in);
	     n=sc.nextInt();
		while(n!=0)
		{
			k = k*10;
			k = k+n%10;
			n=n/10;
			
			
		}
		System.out.println(k);
		
	}
	
	
	public static void alphabet()
	{
		char ch;
		for(ch='a';ch<='z';ch++)
		{
			System.out.println(ch);
		}
		
	}
	
	
}
