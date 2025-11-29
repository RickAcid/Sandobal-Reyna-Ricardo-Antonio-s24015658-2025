class Ahorro{
	public static void main(String arg[]){
	double deposito=500.0, tasa=0.09, saldo=0;
	for (int mes=1;mes<=12;mes++){
		saldo+=deposito;
		saldo+=saldo*tasa;
		System.out.println("Mes: " + mes + " saldo acumulado: " + saldo);}
		System.out.println("total ahorrado durante el año: " + saldo);
	}
} 