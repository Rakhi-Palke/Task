package example1;

import java.util.Scanner;

public class  distinct_assending_element{

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
		//	System.out.println("Enter no ");
			int n=sc.nextInt();
			int[] arr=new int[n];
			int count=0;
			int temp;
			//System.out.println("Enter the array element :");
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			//System.out.print("Unique Element are : \t");
			for(int i=0;i<n;i++)
			{
				int j=0;
				for(j=0;j<i;j++)
				
					if(arr[i]==arr[j])
						break;
				if(i==j)
					count++;
				
				if(i==j)
					
					System.out.println(arr[i] + " ");
				 
			}
			
			System.out.println("count = "+count);
			
	}		

}

