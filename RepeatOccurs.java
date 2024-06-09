public class RepeatOccurs
 {
	public static void main(String[] args) 
	{
		String s="java";
		for(int i=0; i<s.length();i++)
		{
			int count=0;
			for(int j=0; j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
		
				}
	}
		
	int count1=0;
	for(int j=i; j>=0;j--)
	{
		if(s.charAt(i)==s.charAt(j))
		{
			count1++;
		}
	}
	if(count1 == 1)
	{
		System.out.println(s.charAt(i) +" occurs "+ count);
       	}
      }
  
	}
}