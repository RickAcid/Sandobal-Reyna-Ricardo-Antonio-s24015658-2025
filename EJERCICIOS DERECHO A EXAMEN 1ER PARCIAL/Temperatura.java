import java.util.Scanner;
class Temperatura{
	public static void main(String arg[]){
	Scanner s=new Scanner(System.in);
	double c=0, f=0, k=0;
	System.out.println("Dime la temperatura en centigrados");
	c=s.nextDouble();
	f=(c*9/5)+32;
	k=c+273.15;
	System.out.println("La temperatura en Fahrenheit: " + f + " °F");
	System.out.println("La temperatura absoluta es: " + k + " K");
	s.close();}
}