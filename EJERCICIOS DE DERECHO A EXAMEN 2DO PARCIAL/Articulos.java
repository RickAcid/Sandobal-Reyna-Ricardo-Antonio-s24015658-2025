import java.util.Scanner;
import java.util.Arrays; //lo use por que me dio un error al imprimir la matriz y buscando en internet vi que esto lo solucionaba
class Articulos{
	public static void main(String arg[]){
	Scanner s=new Scanner(System.in);
	String matriz[][]=new String[3][3];
	String ejemplo[]={"Camisa","Zapato","Pantalon"};
	for(int i=0;i<3;i++){
		System.out.println("Articulo " + i + " ejemplo: " + ejemplo [i]);
		System.out.print("Nombre: ");
		matriz[i][0]=s.nextLine();
		System.out.print("Talla: ");
		matriz[i][1]=s.nextLine();
		System.out.print("Color: ");
		matriz[i][2]=s.nextLine();
	}
	System.out.println("=====Tabla de articulos=====");
	System.out.println("Articulo,talla,color");
	for (int i=0;i<matriz.length;i++){
		System.out.println(Arrays.toString(matriz[i]));
	}
	s.close();
	}
}