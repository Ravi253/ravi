package com.test;
import java.util.*;
class  Solution3
{
		public void same(String s){
			int count=0;

			char c[]=s.toCharArray();
			for (int i = 0 ; i!= c.length-2 ; i++) {
				
				  
				if(c[i]==c[i+1]){
					if(c[i+1]==c[i+2])
					count++;
				}
				}
		  
		   if(count<=3){
		   System.out.println(count);

		   }
		   else
			System.out.println(0);
	
		
		}
	public static void main(String[] args) 
	{
		Solution3 s=new Solution3();
		s.same("aaaabbjjccc");

	}
}
