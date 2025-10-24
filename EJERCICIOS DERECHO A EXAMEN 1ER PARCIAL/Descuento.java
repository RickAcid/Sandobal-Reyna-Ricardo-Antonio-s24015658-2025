import java.util.Scanner;
class Descuento{
	public static void main(String arg[]){
	Scanner s=new Scanner(System.in);
	double totalCompra=0, descuento=0, pagoTotal=0;
	System.out.println("Cual es el total de tu compra?");
	totalCompra=s.nextDouble();
	descuento=(totalCompra)*.15;
	pagoTotal=totalCompra-descuento;
	System.out.println("Tu monto a pagar es de: " + pagoTotal + " pesos");}
}
