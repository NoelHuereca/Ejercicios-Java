package Package;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); //Objeto console (para usar funciones de System.Console
		
		System.out.println("Ingresa el nombre de tu perro");
		String nombre = scanner.nextLine();
		System.out.println("Ingresa la edad");
		int edad =scanner.nextInt();
		System.out.println("Ingrese peso");
		float peso = scanner.nextFloat();
		
		Perro miPerro = new Perro(edad,nombre,peso); 
		
		miPerro.alimentar(0);
		miPerro.Interactuar();
		miPerro.imprimirInformacion();
	}

}
