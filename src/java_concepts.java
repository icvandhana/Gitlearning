import java.util.ArrayList;

public class java_concepts {

	public static void main(String[] args) {
		
			
			int arr[] = {8,10};
			int arr1[] = {3,5,6,9,11,15};
			String[] s= {"sam","somu"};
			for(int i =0;i<arr.length;i++)
			{
				System.out.println("Print the numbers:" +arr[i]);	
			}
			for(int i:arr)
				
			{
				System.out.println("Print the numbers:" +i);
			}
			for(String name:s) 
			{
				System.out.println("Print the name:" +name);
			}
			for(int name=0;name<s.length;name++)
			{
				System.out.println("print the name:" +s[name]);
			}
			for(int j=0;j<arr1.length;j++)
			{
				if(arr1[j]%2==1)
				{
					System.out.println(arr1[j]+ " is odd number");
					break;
				}
				else
				{
					System.out.println(arr1[j]+ " is even number");
				}
			}
	
			ArrayList<Integer> b = new ArrayList<Integer>();
			b.add(5);
			b.add(9);
			System.out.println(b.get(0));
			ArrayList<String> a = new ArrayList<String>();
			a.add("Sonu");
			a.add("Monu");
			System.out.println(a.get(1));
			
			/*String is an object which contains a series of characters.String can be defined in two ways: String literal and creating memory using new*/
			  			
			/* String literal: If same values is assigned to 2 different variable then it allocates memory for one variable and avoids duplicate. Here it creates either s1 or s2 and s3 */
			String s1 = "My baby";
			String s2 = "My baby";
			String s3 = "Hello";
			
			/* Create memory using new. Here it creates both s4 and s5*/
			String s4 = new String("Hello");
			String s5 = new String("Hello");
			
			String s6 = "Today is a special day";
			String[] splittedString = s6.split(" ");
			System.out.println(splittedString[0]);
			//System.out.println(splittedString[0].trim());
			System.out.println(splittedString[1]);
			//System.out.println(splittedString[1].trim());
			//System.out.println(splittedString[2].trim());
			System.out.println(splittedString[2]);
			//System.out.println(splittedString[3].trim());
			System.out.println(splittedString[3]);
			
			int[] a5= {1,3,5,6,9};
			int total=0;
			for(int m=0;m<a5.length;m++)
			{
				total = total + a5[m];
			}
			System.out.println("Total is:" +total);
			
			int array[] = {90,20,30,10};
			int size = array.length;
			for(int n =0;n<size;n++)
			{
				for(int p=n+1;p<size;p++)
				{
					if(array[n]>array[p])
					{
						int temp=0;
						temp=array[n];
						array[n]=array[p];
						array[p]=temp;
						
					}
						
				}
			}
			System.out.println("Largest number is:" +array[size-1]);
			
			
	}
}

