package arraydemo;

public class ArrayDemo {

	public static void main(String[] args) {
	
		
		double[] myList = new double[5];
		myList[0]= 9.76;
		myList[1]= 9.79;
		myList[2]= 6.76;
		myList[3]= 7.76;
		myList[4]= 9.10;
		
		for(int i=0;i<=4;i++)
		{
			System.out.println(myList[i]);
		}
		
		String[] mySubj = new String[5];
		
		mySubj[0] = "Math";
		mySubj[1] = "Chem";
		mySubj[2] = "Stat";
		mySubj[3] = "OS";
		mySubj[4] = "DS";
		
		System.out.println(mySubj.length);
		
		for(int i=0;i<=mySubj.length-1;i++)
		{
			System.out.println(mySubj[i]);
		}
		
		
		
double[][] my = new double[3][3];
		
		my[0][0]= 9.76;
		my[0][1]= 11.76;
		my[0][2]= 12.76;
		my[1][0]= 18.76;
		my[1][1]= 67.76;
		my[1][2]= 17.76;
		my[2][0]= 62.76;
		my[2][1]= 14.76;
		my[2][2]= 10.76;
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.println(my[i][j]);
			}
			
		}
		
	}

}
