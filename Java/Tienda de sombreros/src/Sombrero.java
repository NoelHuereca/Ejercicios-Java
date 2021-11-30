import java.util.Random;

public class Sombrero {	//Inicio de la clase Sombrero
	//Atributos
	String color,
	    talla,
		modelo;
	int idSombrero;
	//Funciones
	public void Quitar() {
		System.out.println("-Te haz quitado el sombrero");
	}
	
	public void Poner() {
		System.out.println("-Te haz puesto el sombrero");
	}
	
	public void Limpiar() {
		System.out.println("-Se ha limpiado el sombrero");
	}
	
	public void Colgar() {
		System.out.println("-Haz colgado el sombrero");
	}
	
	public void Descolgar() {
		System.out.println("-Haz descolgado el sombrero");
	}
	
	public Sombrero(String pcolor, String ptalla, String pmodelo) {//Inicio del constructor
		color = pcolor;
		talla = ptalla;
		modelo= pmodelo;
		Random id = new Random();
		System.out.println("ID del sombrero: "+id.nextInt(1000));
		System.out.println("Modelo: "+modelo);
		System.out.println("Talla: "+talla);
		System.out.println("Color: "+color);
	}//Fin del constructor

}//Fin de la clase Sombrero
