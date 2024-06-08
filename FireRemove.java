
/* intput num=[2,1,6,4]
 output =1*/
 //Explanation:
//Remove index 0:[1,6,4]-->even sum:1+4=5 odd sum: 6 not fire
//Remove index 1:[2,6,4]-->even sum:2+4=6 odd sum: 6 fire
//Remove index 2:[2,1,4]-->even sum:2+4=6 odd sum: 1 not fire
//Remve index 0:[2,1,6]-->even sum:2+6=8 odd sum: 1 not fire
// there is 1 index that you can remove to make numbers fire



class FireRemove

{
	public static void main(String[] args)
	 {
	 	int []a={2,1,6,4};
		int evensum=0;
		int oddsum=0;
		int v=0;
		for(int i=0;i<a.length;i++)
		{
			evensum=0;
			oddsum=0;
			for(int j=0; j<a.length; j++)
			{
				if(i!=j)
				{
					if(v%2==0)
					{
						evensum+=a[j];
					}
					else
					{
						oddsum+=a[j];
					}
				
					v++;
				}
			}
		
			if(evensum==oddsum)
			{
				System.out.println(i);
			}
		}
	 }
}
