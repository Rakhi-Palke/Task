package Examples;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int a = sc.nextInt();
        for(int i=a; i>=0;i--)
        {
            for(int j=a;j<=0;j++)
            {
            System.out.print(" * ");
            }
            System.out.println(" ");
            
	}
}
}
