import java.util.Scanner;
class universidad{
	public static void main(String arg[]){
	double Nota;
	Scanner s=new Scanner(System.in);
	System.out.println("Ingresa la nota en numeros");
	Nota=s.nextDouble();
	if(Nota<=1.0)
		System.out.println("Tu valoración es P (Pesimo)");
	else if (Nota>=1.1 && Nota<=2.0)
		System.out.println("Tu valoración es M (Mal)");
	else if (Nota>=2.1 && Nota<=2.9)
		System.out.println("Tu valoración es R (Regular)");
	else if (Nota>=3.0 && Nota<=4.0)
		System.out.println("Tu valoración es B (Bien)");
	else if (Nota>=4.1 && Nota<=5.0)
		System.out.println("Tu valoración es E (Excelente)");
	}
}
		