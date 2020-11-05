// Straxinja - 5/2020
import java.util.Scanner;

public class BasicNestedLoops
{

	public static void main( String[] args ){
	
	for(int i = 0; i < 6; i++){
		for(int j = 0; j < 6; j++){
		System.out.print("("+i+","+j+")" + " ");
		try{Thread.sleep(500);}catch(Exception e){}
	  }
		System.out.println();
	 }

	}

}
