package Package1;
import java.util.Scanner;
/*
 * @autor Hugo Noel Huereca Barba
 * Matricula: 010226749
 * Fecha: 01/11/2021
 */
public class Conversion {
	
	Scanner leer = new Scanner(System.in);
	
	public void convertUSDtoMXN()
	{
		double n;
		System.out.printf("\n\tCAMBIO DE DÓLARES ESTADOUNIDENSES A PESOS MEXICANOS\n\n"+
							"Introduce la cantidad a cambiar: ");
		n = leer.nextDouble();
		double res = n * 20.555271;
		System.out.println("Debes entregar al cliente: $"+res + " MXN");
	}
	
	public void convertMXNtoUSD()
	{
		double n;
		System.out.printf("\n\tCAMBIO DE PESOS MEXICANOS A DÓLARES ESTADOUNIDENSES\n\n"+
				"Introduce la cantidad a cambiar: ");
		n = leer.nextDouble();
		double res = n * 0.048634332;
		System.out.println("Debes entregar al cliente: $"+res + " USD");
	}
	
	public void convertCADtoMXN()
	{
		double n;
		System.out.printf("\n\tCAMBIO DE DÓLARES CANADIENSES A PESOS MEXICANOS\n\n"+
				"Introduce la cantidad a cambiar: ");
		n = leer.nextDouble();
		double res = n * 16.624214;
		System.out.println("Debes entregar al cliente: $"+res + " MXN");
	}
	
	public void convertMXNtoCAD()
	{
		double n;
		System.out.printf("\n\tCAMBIO DE PESOS MEXICANOS A DÓLARES CANADIENSES\n\n"+
				"Introduce la cantidad a cambiar: ");
		n = leer.nextDouble();
		double res = n * 0.060148549;
		System.out.println("Debes entregar al cliente: $"+res + " CAD");
	}
	
	public void convertEURtoMXN()
	{
		double n;
		System.out.printf("\n\tCAMBIO DE EUROS A PESOS MEXICANOS\n\n"+
				"Introduce la cantidad a cambiar: ");
		n = leer.nextDouble();
		double res = n * 23.790111;
		System.out.println("Debes entregar al cliente: $"+res + " MXN");
	}
	
	public void convertMXNtoEUR()
	{
		double n;
		System.out.printf("\n\tCAMBIO DE PESOS MEXICANOS A EUROS\n\n"+
				"Introduce la cantidad a cambiar: ");
		n = leer.nextDouble();
		double res = n * 0.042035963;
		System.out.println("Debes entregar al cliente: $"+res + " EUR");
	}

}
