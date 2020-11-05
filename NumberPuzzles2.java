// Straxinja - 5/2020

public class NumberPuzzles2
{

	public static void main( String[] args ){

	int first;
	int second;
	
	for(int i = 1; i <= 56; i++){
		for(int j = 1; j <= 56; j++){
		first = Integer.valueOf(String.valueOf(i) + String.valueOf(j));
		second = Integer.valueOf(String.valueOf(j) + String.valueOf(i));
		if(first - second == i+j){
			System.out.println("This numbers: " + i+" "+j);
		}		
		}
	 }
		
	}

}
