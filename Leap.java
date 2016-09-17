
import java.util.*;
class Leap 
{
	
	public static void main(String[] args) 
	{
        int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year");
	    a=sc.nextInt();
		b=a%100;
		if(b==0)
			c=a%400;
		else 
			c=a%4;

		if(c==0)
			System.out.println(a+""+"is a leap year");
		else
		System.out.println(a+""+"is not a leap year");
	
}
}
