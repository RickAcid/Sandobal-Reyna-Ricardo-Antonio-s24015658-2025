import java.util.Scanner;
class Porcentaje{
	public static void main(String arg[]){
	Scanner s=new Scanner(System.in);
	int hombres=0, mujeres=0, grupo=0;
	double pH=0, porcentajeM=0;
	System.out.println("De cuantos alumnos es tu grupo?");
	grupo=s.nextInt();
	System.out.println("Cuantos hombres tienes en el grupo?");
	hombres=s.nextInt();
	pH=((double)hombres/grupo)*100;
	System.out.println("Cuantas mujeres tienes en el grupo?");
	mujeres=s.nextInt();
	porcentajeM=((double)mujeres/grupo)*100;
	System.out.println("El porcentaje de hombres en el grupo es de: " + pH + "%");
	System.out.println("El porcentaje de mujeres en el grupo es de: " + porcentajeM + "%");
	s.close();}
}