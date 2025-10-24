import java.util.Scanner;
class ej11{
	public static void main(String arg[]){
	Scanner s=new Scanner(System.in);
	double promedio, V1, V2, V3, mayor=0, menor=0;
	System.out.println("Dime el primer valor");
	V1=s.nextDouble();
	System.out.println("Dime el segundo valor");
	V2=s.nextDouble();
	System.out.println("Dime el tercer valor");
	V3=s.nextDouble();
	if ((V1==V2) && (V2==V3)){
		System.out.println("Los tres valores son iguales");}
	else
	if ((V1>V2)&&(V1>V3)){
		System.out.println("El valor 1: " + V1 + " es mayor que los valores 2 y 3");
		mayor=V1;}
	else if ((V2>V1)&&(V2>V3)){
		System.out.println("El valor 2: " + V2 + " es mayor que los valores 1 y 3");
		mayor=V2;}
	else{
		System.out.println("El valor 3: " + V3 + " es mayor que los valores 1 y 2");
		mayor=V3;}
		if ((V1<V2)&&(V1<V3)){
			System.out.println("El valor 1: " + V1 + " es menor que los valores 2 y 3");
			menor=V1;}
		else if ((V2<V1)&&(V2<V3)){
			System.out.println("El valor 2: " + V2 + " es menor que los valores 1 y 3");
			menor=V2;}
		else{
			System.out.println("El valor 3: " + V3 + " es menor que los valores 1 y 2");
			menor=V3;}
			promedio=(V1+V2+V3)/3;
			System.out.println("El valor mayor es: " + mayor);
			System.out.println("El valor menor es: " + menor);
			System.out.println("El promedio es: " + promedio);
			s.close();}
}
				