// Straxinja - 5/2020
import java.util.Scanner;

public class OdometerLoops
{

	public static void main( String[] args ){
	Scanner scan = new Scanner(System.in);
	System.out.print("Which base (2-10): ");
	int base = scan.nextInt();
		for(int thous = 0; thous < base; thous++)
		 for(int hund = 0; hund < base; hund++)
		  for(int tens = 0; tens < base; tens++)
		   for(int ones = 0; ones < base; ones++){
			System.out.println("" + thous + ""+hund+""+tens+""+ones+"\r");
			try{Thread.sleep(100);}catch(Exception e){}
		}
	   
	  	
	 		
		System.out.println();
	}

}
