import java.util.Scanner;
class vector10{
	public static void main(String arg[]){
	Scanner s=new Scanner(System.in);
	int numeros[]= new int[10];
	for(int i=0;i<10;i++){
	System.out.println("numero" + i + ": ");
	numeros[i]=s.nextInt();
	}
	System.out.println("Numeros inversos:");
		for(int i=9;i>=0;i--){
			System.out.println(numeros[i] + " ");
		}
	System.out.println();
	s.close();
	}
}