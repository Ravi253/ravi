class  Solution1
{
		public int sumDigits(String s){
			int sum=0;
			char c;
			for (int i = 0 ; i!= s.length() ; i++) {
				  c = s.charAt(i);
				 if(Character.isLetter(c)){
					 i++;
				 }
				else if(Character.isDigit(c)){
					System.out.println(""+c);
					int value=c-'0';
					 sum=sum+value;
				 }
    
			}
					System.out.println(sum);
			return sum;

		}

	
	public static void main(String[] args) 
	{
		Solution1 s=new Solution1();
		s.sumDigits("aa23cc34");

	}
}
