import java.util.*;
class  ArrayCon
{
	public static void main(String[] args) 
	{
		String array1[]={"a","b","c"};
		String array2[]={"x","y","z"};
		
		for (int i=0;i<array1.length ; i++)
		{
			System.out.println(array1[i]);
	
			System.out.println(array2[i]);
		}
		
	
		List <String> list=new ArrayList<String>(Arrays.asList(array1));
		list.addAll(Arrays.asList(array2));
		list.remove(0);
		Object []array3=list.toArray();
		
		System.out.println(Arrays.toString(array3));
	}
}
