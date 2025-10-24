import java.util.Scanner;
class ParImpar{
	public static void main(String arg[]){
	Scanner s=new Scanner(System.in);
	int N;
	System.out.println("Dame el valor de N");
	N=s.nextInt();
	if (N % 2==0)
		System.out.println("El numero es par");
	else
		System.out.println("El numero es impar");
	}
}
	
	