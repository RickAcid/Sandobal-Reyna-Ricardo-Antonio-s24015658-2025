import java.util.Scanner;
class Primo{
	public static void main(String arg[]){
	Scanner s=new Scanner(System.in);
	int N, i;
	boolean P=true;
	System.out.println("Dame el valor de N");
	N=s.nextInt();
	if (N <= 1)
		P=false;
	else if (N == 2)
		P=true;
	else
		for(i=2; i<= Math.sqrt(N); i++)
			if(N % i == 0){
			P=false;
		break;}
	if (P)
		System.out.println("El numero " + N + " es primo");
	
	else
		System.out.println("El numero " + N + " no es primo");
	}
}
	
	
	
	
