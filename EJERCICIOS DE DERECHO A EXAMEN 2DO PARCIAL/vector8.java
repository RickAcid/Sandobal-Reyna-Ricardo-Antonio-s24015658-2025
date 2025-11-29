import java.util.Scanner;
class vector8{
	public static void main(String arg[]){
	Scanner s=new Scanner(System.in);
	int numeros[]= new int[8];
	System.out.println("Introduce los numeros");
	for (int i=0;i<8;i++){
		numeros[i]=s.nextInt();}
	System.out.println("Introduce un numero a buscar");
	int N=s.nextInt();
	for (int i=0;i<8;i++){
		if(N==numeros[i]){	
			System.out.println("El numero existe");}
		else{
			System.out.println("El numero no existe");}	
	}
	s.close();
	}
}
	


		