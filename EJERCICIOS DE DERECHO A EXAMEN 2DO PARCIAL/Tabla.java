import java.util.Scanner;
class Tabla{
	public static void main(String arg[]){
	Scanner s=new Scanner(System.in);
	System.out.println("Introduce un numero entero");
	int num=s.nextInt();
	System.out.println("Tabla del " + num + ":");
	for(int i=0;i<=10;i++){
	System.out.println(num + " * " + i + " = " + (num*i));}
	s.close();
	}
}
