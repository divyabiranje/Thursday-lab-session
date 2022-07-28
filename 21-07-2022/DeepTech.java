public class DeepTech
  {
      public static void main (String[]args)
  	 {
		for(int i=1 ; i<=100 ; i++)
		{
		
		if(i%3==0&&i%5==0)
			{
				System.out.print("Deep_Tech" + " ");
			}
		else if(i%5==0)
			{
				System.out.print("Tech" + " ");
			}
		else if(i%3==0)
			{
				System.out.print("Deep" + " ");
			}
		else
			{
			        System.out.print(i + " ");	
			}
				
		}
  	 }


 }