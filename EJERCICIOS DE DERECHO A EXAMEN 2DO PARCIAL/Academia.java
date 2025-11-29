import java.util.Scanner;
class Academia{
	public static void main(String arg[]){
	Scanner s=new Scanner(System.in);
	int matriz[][]=new int[3][4];
	for (int i=1;i<=12;i++){
		System.out.println("Alumno " + i);
		System.out.print("¿Que nivel tiene? 0.básico, nivel 1.medio, nivel 2.perfecto: ");
		int nivel=s.nextInt();
		System.out.print("¿Que idioma cursa? 0.Ingles, 1.Frances, 2.Alemán, 3.Ruso: ");
		int idioma=s.nextInt();
		if(nivel>=0 && nivel < 3 && idioma >=0 && idioma <4){
			matriz[nivel][idioma]++;
		}else{
			System.out.println("Valor invalido. repite por favor");
			i--;
		}
	}
	for(int i=0;i<3;i++){
		for(int j=0;j<4;j++){
			System.out.print(matriz[i][j]);
	}
	System.out.println();
	}
	s.close();
	}
}