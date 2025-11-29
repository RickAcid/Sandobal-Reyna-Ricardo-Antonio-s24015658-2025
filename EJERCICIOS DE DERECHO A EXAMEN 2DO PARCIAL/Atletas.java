import java.util.Scanner;
import java.util.Arrays;
class Atletas{
	public static void main(String arg[]){
	Scanner s=new Scanner(System.in);
	System.out.print("¿Cuantos atletas vas a registrar? ");
	int num=s.nextInt();
	s.nextLine();
	String datos[][]= new String[num][3];
	double tiempos[]= new double[num];
	for (int i=0;i<num;i++){
		System.out.println("Atleta " + i);
		System.out.println("Nombre: ");
		datos[i][0]=s.nextLine();
		System.out.println("Apellido: ");
		datos[i][1]=s.nextLine();
		System.out.println("Especialidad: ");
		datos[i][2]=s.nextLine();
		System.out.println("Tiempo: ");
		tiempos[i]=s.nextDouble();
		s.nextLine();
	}
	int mejortiempo=0;
	for (int i=1;i<num;i++){
		if (tiempos[i]<tiempos[mejortiempo])
			mejortiempo=i;
	}
	System.out.println("=====Lista de atletas=====");
	for (int i=0;i<num;i++){
		System.out.println(datos[i][0]);
		System.out.println(datos[i][1]);
		System.out.println(datos[i][2]);
		System.out.println(tiempos[i]);
	}
	System.out.println("Mejor tiempo fue: ");
	System.out.println(datos[mejortiempo][0]);
	System.out.println(datos[mejortiempo][1]);
	System.out.println(datos[mejortiempo][2]);
	System.out.println(tiempos[mejortiempo]);
	s.close();
	}
}