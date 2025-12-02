import java.util.Scanner;
class proyectofinal{
	public static void ordenporclave(String nombretrabajador[], int edad[], int clave[], int sueldo[], int horas[], int contador){	//lo puse mal (dentro del main) lo movi para arriba
		for (int i=0;i<contador;i++){
			for (int j=0;j<contador;j++){
				if (clave[i]<clave[j]){ 
					int intercambiarclaves=clave[i];
					clave[i]=clave[j];
					clave[j]=intercambiarclaves;	
	
					String intercambiarnombre=nombretrabajador[i];
					nombretrabajador[i]=nombretrabajador[j];
					nombretrabajador[j]=intercambiarnombre;
					
					int intercambiaredad=edad[i];
					edad[i]=edad[j];
					edad[j]=intercambiaredad;
			
					int intercambiarsueldo=sueldo[i];
					sueldo[i]=sueldo[j];
					sueldo[j]=intercambiarsueldo;

					int intercambiarhoras=horas[i];
					horas[i]=horas[j];
					horas[j]=intercambiarhoras;
				}
			}
		}
	}			
	
	public static void main(String arg[]){
	Scanner s=new Scanner(System.in);

	String nombretrabajador[]= new String[3];

	int clave[]= new int[3];
	int sueldo[]= new int[3];
	int horas[]= new int[3];
	int edad[]= new int[3];

	int opcion;
	int repetir;
	int contador=0;
	int buscar; 
	String buscar2;
	char continuar='s';
	char confirmar;

	do{	
	System.out.println("=====SISTEMA DE GESTION DE TRABAJADORES=====");
	System.out.println("1.Alta de trabajadores");
	System.out.println("2.Consultas generales");
	System.out.println("3.Consultas por clave");
	System.out.println("4.Consultas por nombre");
	System.out.println("5.Salir");
	System.out.println("============================================");
	opcion=s.nextInt();

	switch(opcion){
		case 1:
			if (contador<3){
				
			do{	
				s.nextLine(); //limpia el buffer si no nomas leee el enter en lo del nombre xd
				System.out.println("Ingresa el nombre del trabajador: ");
				nombretrabajador[contador]=s.nextLine();
				System.out.println("Ingresa la edad del trabajador: ");
				edad[contador]=s.nextInt();
				System.out.println("Ingresa la clave del trabajador: ");
				clave[contador]=s.nextInt();
				System.out.println("Ingresa su sueldo: ");
				sueldo[contador]=s.nextInt();
				System.out.println("Ingresa las horas trabajadas: ");
				horas[contador]=s.nextInt();

				contador++;
				
				if (contador>=3){
					System.out.println("Alcanzaste el maximo permitido");
					break;
				}

				System.out.println("Presiona 1 para agregar otro trabajador o presiona 2 para volver al menu.");
				repetir=s.nextInt();

				}while (repetir==1);
			
			}else{
				System.out.println("Volviendo al menu...");
			}
		break;


		case 2:
			ordenporclave(nombretrabajador,edad,clave,sueldo,horas,contador);
			System.out.println("");
			System.out.println("");
			System.out.println("===Lista de trabajadores registrados===");
			for (int i=0;i<contador;i++){
				System.out.println("Nombre: " + nombretrabajador[i]);
				System.out.println("Edad: " + edad[i]);
				System.out.println("Clave: " + clave[i]);
				System.out.println("sueldo: " + sueldo[i]);
				System.out.println("horas: " + horas[i]);
				System.out.println("==================================");
			}
			
		break;


		case 3:
			System.out.println("");
			System.out.println("");
			System.out.println("Ingresa la clave del trabajador: ");
			buscar=s.nextInt();
			
			boolean encontrado=false;
	
			for (int i=0;i<contador;i++){
				if(clave[i]==buscar){

				System.out.println("===Trabajador encontrado===");
				System.out.println("Nombre: "+nombretrabajador[i]);
				System.out.println("Edad: "+edad[i]);
				System.out.println("Clave: "+clave[i]);
				System.out.println("Sueldo: "+sueldo[i]);
				System.out.println("Horas: "+horas[i]);
				System.out.println("");
				
				encontrado=true;
				break;
				}
			}
				if(!encontrado){
				System.out.println("No existe un trabajador con esa clave");
				}
		break;


		case 4:
			s.nextLine();
			System.out.println("");
			System.out.println("");
			System.out.println("Ingresa el nombre del trabajador: ");
			buscar2=s.nextLine();
			
			boolean encontrado2=false; 	
			for (int i=0;i<contador;i++){
				if(nombretrabajador[i].equalsIgnoreCase(buscar2)){ 
				System.out.println("===Trabajador encontrado===");
				System.out.println("Nombre: "+nombretrabajador[i]);
				System.out.println("Edad: "+edad[i]);
				System.out.println("Clave: "+clave[i]);
				System.out.println("Sueldo: "+sueldo[i]);
				System.out.println("Horas: "+horas[i]);
				System.out.println("");

				encontrado2=true; 
				break;
				}
			}
				if(!encontrado2){ 
				System.out.println("No existe un trabajador con ese nombre");
				}
		break;

	
		case 5:
				
				System.out.println("Seguro que quieres salir del sistema? (s/n): ");
				confirmar=s.next().charAt(0);	
				
				if(confirmar == 's' || confirmar == 'S'){				
					continuar='n';
					System.out.println("Saliendo del sistema...");
				}else {
					System.out.println("Cancelando. Regresando al menu...");
					System.out.println("");
					System.out.println("");
					continuar='s';				
				}
		break;


		default:
			System.out.println("Opcion invalida. Intenta con los numeros del 1 al 5");
		break;
		}		
			}while(continuar=='s'||continuar=='S');
			
			System.out.println("Programa terminado");
	}
}
	
	





