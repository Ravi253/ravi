package com.test;

import java.util.*;
class Sum 
{
	
	public static void main(String[] args) 
	{
        int a,b,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first positive  number");
	      a=sc.nextInt();
		 System.out.println("Enter second positive  number");
		   b=sc.nextInt();
		if(a<b){ 
		for(int i=a;i<=b;i++){
		sum=sum+i;
		}
		}
		else if(a>b){
		for(int i=b;i<=a;i++){
		sum=sum+i;
		}
		}
		else
			System.out.println("enter different nembers");
		System.out.println(sum);

	}

}
