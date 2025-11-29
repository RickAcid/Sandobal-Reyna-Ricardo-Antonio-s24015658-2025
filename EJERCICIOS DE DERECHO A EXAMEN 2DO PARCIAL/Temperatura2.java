import java.util.Scanner;
	class Temperatura2{
	public static void main(String arg[]){
	Scanner s=new Scanner(System.in);
	String paises[]= new String[4];
	double temp[][]= new double [4][3];
	double medias[]= new double [4];
	for (int i=0;i<4;i++){
		System.out.print("Nombre del país " + i + ": ");
		paises[i]=s.nextLine();
		double suma=0;
		for (int j=0;j<3;j++){
			System.out.print("Temperatura mes " + j + " de " + paises[i] + ": ");
			temp[i][j]=s.nextDouble();
			suma+=temp[i][j];
		}
		s.nextLine();
		medias[i]=suma/3;
	}
	System.out.println("Temperaturas ingesadas:");
	for (int i=0;i<4;i++){
		System.out.println(paises[i] + ": " + temp[i] + " Media: " + medias[i]);
	}
	int mayormedia=0;
	for (int i=1;i<4;i++){
		if (medias[i]>medias[mayormedia]){
		mayormedia=i;
		}
	System.out.println("Pais con mayor media trimestral: " + paises[mayormedia] + "-" + medias[mayormedia] + "-");
	}
	s.close();
	}
}