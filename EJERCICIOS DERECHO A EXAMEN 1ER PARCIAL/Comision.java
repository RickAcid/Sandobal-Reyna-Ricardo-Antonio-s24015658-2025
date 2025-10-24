import java.util.Scanner;
class Comision{
	public static void main(String arg[]){
	Scanner s=new Scanner(System.in);
	double comision=0, ventas=0, totalComision=0;
	int i=1;	
		for(i=1; i<=4; i++){
			System.out.println("Dame el valor de la venta " + i + ": ");
			ventas=s.nextDouble();
				if(ventas<=10000000){
				comision=ventas*0.02;}
				else if((ventas>10000000)&&(ventas<15000000)){
				comision=ventas*0.04;}
				else if(ventas>15000000){
				comision=ventas*0.10;}
				System.out.println("La comisión es: " + comision);
				totalComision+=comision;
				System.out.println("el total ganado en comisiones: " + totalComision);
		}
	}
}
			
	
	

	
	