import java.util.Scanner;
class Hospital{
	public static void main(String arg[]){
	Scanner s=new Scanner(System.in);
	double presupuesto, g, t, p;
	System.out.println("Ingrese el presupuesto anual del hospital");
	presupuesto=s.nextDouble();
	g=presupuesto*0.40;
	t=presupuesto*0.30;
	p=presupuesto*0.30;
	System.out.println("Ginecología: $" + g);
	System.out.println("Traumatologia: $" + t);
	System.out.println("Pediatria: $" + p);
	}
}
	