// Straxinja - 5/2020

public class MultiplicationTable
{

	public static void main( String[] args ){

	System.out.print("x | ");		
	
	for(int i = 1; i < 10; i++){
		System.out.print(i + "\t");
	 }

	System.out.println();
	System.out.println("==+==================================================================");
	
		for(int i = 1; i < 10; i++){
			System.out.print(i + " | ");
		for(int j = 1; j < 10; j++){
		 	System.out.print(i*j + "\t");
			
		}
			System.out.println();
	 }
	}

}
