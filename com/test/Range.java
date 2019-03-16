package com.test;

import java.util.*;
class Range 
{
	
	public static void main(String[] args) 
	{
        int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first positive Two digit number");
	      a=sc.nextInt();
		 System.out.println("Enter second positive Two digit number");
		   b=sc.nextInt();
		 
		if(a>=10 && a<=20){
			if(b>=10 && b<=20)
				  System.out.println("true");
			else
			     System.out.println("false");
		}
		else
			     System.out.println("false");
		}



	}

