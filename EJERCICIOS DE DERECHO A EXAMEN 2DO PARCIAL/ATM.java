import java.util.Scanner;
class ATM{
	public static void main(String arg[]){
	Scanner s=new Scanner(System.in);
	int opcion;
	double adeudo=1000.00;
	char continuar;	
	System.out.println("Bienvenido, que operación deseas realizar?");
	do{
	System.out.println("1. Consulta");
	System.out.println("2. Pago del mes");
	System.out.println("3. Pago de adeudo");
	System.out.println("4. Salir");
	opcion=s.nextInt();
	switch(opcion){
		case 1:
			System.out.println("===========================");
			System.out.println("Usted tiene que pagar de $1830.00 pesos debido al pago mensual y su adeudo");
		break;
		case 2:
			System.out.println("====El pago del mes es de $830.00 pesos====");
			System.out.println("Pago realizado exitosamente");
		break;
		case 3:
			System.out.println("===Tiene un adeudo de $1000.00===");
			System.out.println("Pagado exitosamente");
		break;
		case 4:
			System.out.println("==================");
			System.out.println("Proceso finalizado");
		return;
		default:
			System.out.println("====================");
			System.out.println("Ingrese una operacion valida");
		break;}
	System.out.println("¿Deseas continuar con otro servicio? s/n");
	continuar=s.next().charAt(0);
	}while(continuar=='s'||continuar=='S');
	System.out.println("Operacion finalizada");
	}
}
	
			
		