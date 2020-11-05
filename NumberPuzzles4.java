// Straxinja - 5/2020

public class NumberPuzzles4
{

	public static void main( String[] args ){
	
	for(int a = 1; a < 50; a++){
	for(int b = 1; b < 50; b++){
	for(int c = 1; c < 50; c++){
	for(int d = 1; d < 50; d++){
		if((a+2)+(b-2)+(c*2)+(d/2) == 45)
//if(a+b+c+d == 45)
{System.out.println("Yes " + " here are the numbers " + a+" "+b+" "+c+" "+d);}
	}	
	}
	}
	}
		
	}

}
