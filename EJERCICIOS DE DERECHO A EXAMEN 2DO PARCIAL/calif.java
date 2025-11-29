import java.util.Scanner;
class calif{
	public static void main(String arg[]){
	Scanner s=new Scanner(System.in);
	int aprobados=0, reprobados=0;
	double suma=0;
	for(int i=1;i<=5;i++){
		System.out.println("Dime la calificación del alumno " + i + " en escala de 1 a 10");
		double calf=s.nextDouble();
		suma+=calf;
		if (calf>=6)
			aprobados++;
		else
			reprobados++;}
	double promedio=suma/5;
	System.out.println("Aprobaron: " + aprobados);
	System.out.println("Reprobaron: " + reprobados);
	System.out.println("Promedio del grupo: " + promedio);
	s.close();
	}
}