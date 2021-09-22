package Tuesday17;

public class Practice1{    
	   public static void main(String args[]){  
		  Pranita p=new Pranita();
		  Gunjan g=new Gunjan();
		  
	p.start();
	g.start();
	
	   }
	   
	   }

class Pranita extends Thread {
	public void run(){
		for(;;)
		{
			System.out.println("Red Signal ");
		try{
			Thread.sleep(20000);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	
}
}
class Gunjan extends Thread{
	public void run(){
		for(;;)
		{
			System.out.println("Green Signal ");
			try{
				Thread.sleep(20000);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	
	}
}

