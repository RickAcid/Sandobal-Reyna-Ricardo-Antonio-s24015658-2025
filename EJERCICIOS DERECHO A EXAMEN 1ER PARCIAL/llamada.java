import java.util.Scanner;
class llamada{
	public static void main(String arg[]){
	int tiempo, cantidadpago;
	Scanner s=new Scanner(System.in);
	System.out.println("Dime la cantidad de tiempo que deseas");
	tiempo=s.nextInt();
	if (tiempo<=3)
		cantidadpago=10;
	else
		cantidadpago=10+(tiempo-3)*1;
	System.out.println("El total a pagar es de: $ " + cantidadpago);
	}
}