import java.util.Scanner;
class Organizacioin{
	public static void main(String arg[]){
	Scanner s=new Scanner(System.in);
	int categoria;
	double horas, descuento=0, salario=0, subsidio=0, salarioDesvengado;
	System.out.println("A que categoría perteneces?");
	System.out.println("1. $20.000");
	System.out.println("2. $15.000");
	System.out.println("3. $10.000");
	System.out.println("4. $7.500");
	categoria=s.nextInt();
	System.out.println("Cuantas horas trabajaste durante el mes?");
	horas=s.nextDouble();
	switch(categoria){
	case 1:
		salario=20000;
	break;
	case 2: 
		salario=15000;
	break;
	case 3:
		salario=10000;
	break;
	case 4:
		salario=7500;
	break;
	default:
		System.out.println("No existe esa categoría, intenta de nuevo.");}
	salarioDesvengado=salario*horas;
	descuento=salarioDesvengado*.72;
	if (salarioDesvengado<1000){
	subsidio=salarioDesvengado*.15;}
	salario=salarioDesvengado-descuento+subsidio;
	System.out.println("Categoria: " + categoria);
	System.out.println("Horas trabajadas: " + horas);
	System.out.println("Salario: $" + salario);
	System.out.println("Salario Desvengado: $" + salarioDesvengado);
	System.out.println("Descuento salud: $" + descuento);
	System.out.println("Subsidio (si aplica): $" + subsidio);}
}
	
		
		
	
	