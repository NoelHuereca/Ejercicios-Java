package Package1;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Conversion convertir = new Conversion();
		
		Scanner leer = new Scanner(System.in); //Creacion de objeto leer a partir de la clase Scanner que nos servira para capturar datos del teclado
		int select;
		
		
		
		//-------------MENU-------------
		System.out.printf("\t\tCONVERSOR DE DIVISAS\n\n"+
							"1-Cambio de Dólares estadounidenses a pesos mexicanos\n"+
							"2-Cambio de pesos mexicanos a Dólares estadounidenses\n"+
							"3-Cambio de Dólares canadienses a pesos mexicanos\n"+
							"4-Cambio de pesos mexicanos a Dólares canadienses\n"+
							"5-Cambio de Euros a pesos mexicanos\n"+
							"6-Cambio de pesos mexicanos a Euros\n\n"+
							"Porfavor seleccione una de las siguientes opciones: ");
		
		switch(select = leer.nextInt())
		{
		case 1:	convertir.convertUSDtoMXN();
				break;
		case 2:	convertir.convertMXNtoUSD();
				break;
		case 3:	convertir.convertCADtoMXN();
				break;
		case 4:	convertir.convertMXNtoCAD();
				break;
		case 5:	convertir.convertEURtoMXN();
				break;
		case 6:	convertir.convertMXNtoEUR();
				break;
		}
	}
}

