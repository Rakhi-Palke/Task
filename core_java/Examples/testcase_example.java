package Examples;

import java.util.Scanner;

public class testcase_example {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int n = sc.nextInt();    //array size
		int i;
		int count = 0;
		if(n<0){
			System.out.println("Invalid Array Size");	
		}
		else{
		int a[]=new int[n];   //array declaration
		
		for( i=0;i<n;i++){
			a[i]=sc.nextInt();
		    if(a[i]<0){
			System.out.println(("Invalid input"));
		}	
		if(a[i]%10==3){
			count++;
		}
		
		}
		System.out.println(count);
		}
}
}