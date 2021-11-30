import java.util.Scanner;

public class Area_de_un_triangulo {

	public static void main(String[] args) {
		//declaracion de variables 
		float base = 0.0f;	
		float altura;
		float resultado;
		Scanner escanear = new Scanner(System.in);
		System.out.println("Ingrese la medida de la base : ");
		base = escanear.nextFloat();
		System.out.println("Ingrese la medida de la altura : ");
		altura = escanear.nextFloat();
		resultado = (base * altura)/2;
		System.out.println("resultado : "+resultado);
	}

}
