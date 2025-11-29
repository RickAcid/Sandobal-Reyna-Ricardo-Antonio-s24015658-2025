import java.util.Scanner;
class ventasemana{
	public static void main(String arg[]){
	Scanner s=new Scanner(System.in);
	double ventas[]= new double[7];
	String dias[]={"Lunes","Martes","Miércoles","Jueves","Viernes","Sabado","Domingo"};
	double total=0;
	int MejorDia=0;
	for(int i=0;i<7;i++){
		System.out.print("venta " + dias[i] + ": $");
		ventas[i]=s.nextDouble();
		total+=ventas[i];
	}
	for(int i=1;i<7;i++){
		if (ventas[i]>ventas[MejorDia])
		MejorDia=i;
	}
	System.out.println("Venta total de la semana: $" + total);
	System.out.println("Dia con mayor venta: " + ventas[MejorDia]);
	s.close();
	}
}
	