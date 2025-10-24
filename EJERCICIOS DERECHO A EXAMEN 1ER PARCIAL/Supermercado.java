import java.util.Scanner;
class Supermercado{
	public static void main(String arg[]){
	Scanner s=new Scanner(System.in);
	int numero;
	double descuento, total;
	System.out.println("Cual numero tienes?");
	numero=s.nextInt();
	System.out.println("Dime el total de tu compra");
	total=s.nextDouble();
	if (numero<=74)
		descuento=total*0.15;
	else 
		descuento=total*0.20;
	System.out.println("El dinero a descontar es de: $" + descuento);
	}
}