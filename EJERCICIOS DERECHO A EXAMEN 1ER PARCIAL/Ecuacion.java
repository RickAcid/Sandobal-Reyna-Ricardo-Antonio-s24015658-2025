import java.util.Scanner;
class Ecuacion{
	public static void main(String arg[]){
	Scanner s=new Scanner(System.in);
	double A,B,C, discriminante=0, raiz1=0, raiz2;
	System.out.println("Ingrese el coeficiente A");
	A=s.nextDouble();
	System.out.println("Ingrese el coeficiente B");
	B=s.nextDouble();
	System.out.println("Ingrese el coeficiente C");
	C=s.nextDouble();
	if (A==0)
		System.out.println("La ecuación no es cuadratica");
	else
		discriminante= B*B-4*A*C;
	if (discriminante < 0)
		System.out.println("Error. Raices imaginarias");
	else
		raiz1=(-B + Math.sqrt(discriminante)) / (2*A);
		raiz2=(-B - Math.sqrt(discriminante)) / (2*A);
		System.out.println("Raiz 1: " + raiz1);
		System.out.println("Raiz 2: " + raiz2);
	}
}
