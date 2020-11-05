// Straxinja - 5/2020

public class ArmstrongNumbers
{

	public static void main( String[] args ){

	int armstrong; 
	double sum;
	int all;

	for(int i = 1; i < 15; i++){
	 for(int j = 1; j < 15; j++){
		for(int s = 1; s < 15; s++){
			armstrong = Integer.valueOf(String.valueOf(i) + String.valueOf(j) + String.valueOf(s));
			sum = Math.pow(i, 3) + Math.pow(j, 3) + Math.pow(s, 3);
			all = (int) sum;
		if(armstrong == sum){
				System.out.println("Armstrong number is: " + all + " , because of this characters => " + i + " " + j + " " + s);
			}
		}
		}
		}
		
	}

}
