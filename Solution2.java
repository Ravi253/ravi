import java.util.*;
class  Solution2
{
		public void same(String s){
			int count=0;

			char c[]=s.toCharArray();
			for (int i = 0 ; i!= c.length-1 ; i++) {
				
				  
				if(c[i]==c[i+1])
					count++;
		   }
		   System.out.println(count);
		   
	
		}
	
	public static void main(String[] args) 
	{
		Solution2 s=new Solution2();
		s.same("aaccc");

	}
}
