import java.util.Scanner;
class EdadP{
	public static void main(String arg[]){
	Scanner s=new Scanner(System.in);
	int edad=0, añoN=0, añoA=0;
	System.out.println("Dime tu año de nacimiento");
	añoN=s.nextInt();
	System.out.println("Dime el año actual");
	añoA=s.nextInt();
	edad=añoA-añoN;
	System.out.println("Tu edad actual es de: " + edad + " años");
	s.close();}
}