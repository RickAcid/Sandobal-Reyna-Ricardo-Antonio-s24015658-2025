import java.util.Scanner;
class Obrero{
	public static void main(String arg[]){
	Scanner s=new Scanner(System.in);
	double Aumento, salario, incremento=.25, nuevoSalario;
	System.out.println("Dime el salario actual del obrero");
	salario=s.nextDouble();
	Aumento=salario*incremento;
	nuevoSalario=Aumento+salario;
	System.out.println("El nuevo salario del obrero es de: " + nuevoSalario + " pesos");
	s.close();}
}