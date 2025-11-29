import java.util.Scanner;
class empleados{
	public static void main(String arg[]){
	Scanner s=new Scanner(System.in);
	String nombres[]= new String[4];
	double sueldos[][]=new double [4][3];
	double acumulados[]=new double [4];
	double totalPago=0;
	for(int i=0;i<4;i++){
		System.out.print("Nombre del empleado " + i + ": ");
		nombres[i]=s.nextLine();
		double suma=0;
		for (int mes=0;mes<3;mes++){
			System.out.print("sueldo del mes " + mes + " de " + nombres[i] + ": $");
			sueldos[i][mes]=s.nextDouble();
			suma+=sueldos[i][mes];
		}
		s.nextLine();
		acumulados[i]=suma;
		totalPago+=suma;
		}
		for (int i=0;i<4;i++){
		System.out.println("Ingresos acumulados por empleados: " + acumulados[i]);
		System.out.println("Total pagado a todos los empleados: " + totalPago);
		}
		int mayoringreso=0;
		for(int i=1;i<4;i++){
			if(acumulados[i]>acumulados[mayoringreso])
			mayoringreso=i;
		}
		System.out.println("Empleado con el mayor ingreso acumulado es: " + nombres[mayoringreso] + " y tiene $" + acumulados[mayoringreso]);
	}
}