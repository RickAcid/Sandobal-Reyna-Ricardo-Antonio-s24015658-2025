import java.util.Scanner;
class vectorcali{
	public static void main(String arg[]){
	Scanner s=new Scanner(System.in);	
	double cal[]= new double[6];
	double suma=0;
	for (int i=0;i<6;i++){
		System.out.print("Calificación " + i + ": ");
		cal[i]=s.nextDouble();
		suma+=cal[i];}
	double promedio=suma/6;
		for(int i=0;i<cal.length;i++){
			System.out.println("Calificaciones: " + cal[i]);}
	System.out.println("Promedio general: " + promedio);
	s.close();
	}
}