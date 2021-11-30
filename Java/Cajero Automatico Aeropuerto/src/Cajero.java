import java.util.Scanner;

public class Cajero {
	//Atributos
	int horas;
	int costo;

	Scanner scanner = new Scanner(System.in); //Objeto Scanner
	//Metodos
	
	public void PedirHoras(){
		System.out.println("Cuantas Horas uso el estacionamiento?");
		horas = scanner.nextInt();
		if(horas >= 59)
			costo = 999;
		else
			costo = horas * 17;
	}
	public void Cobrar() {
		while(costo>=0) {
			System.out.printf("Debes: $"+costo+". ");
			System.out.println("Elige una opcion para tu pago:\n"+
					"1) $100\t2) $50\t3) $20\n"+
					"4) $10\t5) $5\t6) $2\t7) $1");
			
			switch(scanner.nextInt()) {
				case 1:	costo -= 100;
					break;
				case 2: costo -= 50;
					break;
				case 3:	costo -= 20;
					break;
				case 4:	costo -= 10;
					break;
				case 5:	costo -= 5;
					break;
				case 6:	costo -= 2;
					break;
				case 7:	costo -= 1;
				default: System.out.println("Opcion incorrecta. Seleccione una opcion valida");
					break;
			}//Fin del switch
		}//Fin del ciclo while
	}
	public void Cambio() {
		costo = Math.abs(costo);
		int cambio = 0;
		System.out.println("Cambio:");
		if(costo >= 10) {
			cambio = costo / 10;
			costo -= cambio * 10;
			System.out.println(cambio+" moneda(s) de 10.");
			cambio = 0;
		}
		else
			System.out.println(cambio+" monedas(s) de 10.");
		if(costo >= 5) {
			cambio = costo / 5;
			costo -= cambio * 5;
			System.out.println(cambio+" monedas(s) de 5.");
			cambio = 0;
		}
		else
			System.out.println(cambio+" moneda(s) de 5.");
		if(costo >= 2) {
			cambio = costo / 2;
			costo -= cambio * 2;
			System.out.println(cambio+" moneda(s) de 2.");
			cambio = 0;
		}
		else
			System.out.println(cambio+" moneda(s) de 2.");
		if(costo == 1) {
			cambio = costo / 1;
			costo -= cambio * 1;
			System.out.println(cambio+" moneda(s) de 1.");
			cambio = 0;
		}
		else
			System.out.println(cambio+" moneda(s) de 1.");
	}
}
