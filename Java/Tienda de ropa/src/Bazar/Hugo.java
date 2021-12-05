package Bazar;
import entidades.Calcetines;
import entidades.Camisa;
import entidades.Chamarra;
import entidades.Pantalones;
import entidades.Prenda;

public class Hugo {

	public static void main(String[] args) {
		//New camisa
		Camisa camisa = new Camisa();
		camisa.setDescripcion("Camisa modelo Boston");
		camisa.setCodigoColor('w');
		camisa.setTalla("XL");
		camisa.setPrecio(1020.26f);
		camisa.setExistencia(75);
		camisa.desplegarInformacion();
		System.out.println("");
		//New pantalones
		Pantalones pantalon = new Pantalones();
		pantalon.setDescripcion("Pantalones de gabardina");
		pantalon.setPrecio(499.99f);
		pantalon.setExistencia(55);
		pantalon.setTalla((byte) 28);
		pantalon.setLargo((byte) 32);
		pantalon.desplegarInformacion();
		System.out.println("");
		//New chamarra
		Chamarra chamarra = new Chamarra();
		chamarra.setDescripcion("Chamarra estilo cazadora");
		chamarra.setPrecio(1600.0f);
		chamarra.setExistencia(20);
		chamarra.setTalla((byte) 38);
		chamarra.setMaterial("Algodon");
		chamarra.desplegarInformacion();
		System.out.println("");
		//New calcetines
		Calcetines calcetines = new Calcetines();
		calcetines.setDescripcion("Calcetines modelo New York");
		calcetines.setCodigoColor('x');
		calcetines.setPrecio(99.50f);
		calcetines.setExistencia(150);
		calcetines.desplegarInformacion();
		System.out.println("");
		//New prenda
		Prenda prenda = new Prenda();
		prenda.desplegarInformacion();
	}

}
