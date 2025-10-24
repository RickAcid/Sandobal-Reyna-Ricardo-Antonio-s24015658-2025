import java.util.Scanner;
class PromedioAlumno{
	public static void main(String arg[]){
	Scanner s=new Scanner(System.in);
	double M1, M2, M3, PromedioG;
	System.out.println("Cual es tu calificación de la materia 1?");
	M1=s.nextDouble();
	System.out.println("Cual es tu calificación de la materia 2?");
	M2=s.nextDouble();
	System.out.println("Cual es tu calificación de la materia 3?");
	M3=s.nextDouble();
	PromedioG=(M1+M2+M3)/3;
	System.out.println("Tu promedio es de: " + PromedioG);
	System.out.println("Tu promedio general es: " + PromedioG);
	s.close();}
}