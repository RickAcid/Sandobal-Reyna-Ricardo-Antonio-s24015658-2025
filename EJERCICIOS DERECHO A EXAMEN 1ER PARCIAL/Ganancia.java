import java.util.Scanner;
class Ganancia{
	public static void main(String arg[]){
	Scanner s=new Scanner(System.in);
	double capital=0, ganancia=0, total=0, interes=.02;
	System.out.println("Dime el capital");
	capital=s.nextDouble();
	ganancia=capital*interes;
	total=capital+ganancia;
	System.out.println("La ganancia después de un mes es de: " + ganancia + " pesos");
	System.out.println("El total acumulado después de un mes es de: " + total + " pesos");
	s.close();}
}
	