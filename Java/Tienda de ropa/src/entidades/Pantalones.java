package entidades;

public class Pantalones extends Prenda{
	//Atributos
	private byte talla = 00;
	private byte largo = 00;
	
	//Metodos
	public void setTalla(byte t) {
		talla = t;
	}
	
	public byte getTalla() {
		return talla;
	}
	
	public void setLargo(byte l) {
		largo = l;
	}
	
	public byte getLargo() {
		return largo;
	}
	
	//Sobreescritura de metodos
	public void desplegarInformacion() {
		System.out.println("El ID del pantalon es : "+getId());
		System.out.println("La descripcion del pantalon es : "+getDescripcion());
		System.out.println("El precio del pantalon es : $"+getPrecio());
		System.out.println("La cantidad en existencias de pantalones es : "+getExistencia());
		System.out.println("La talla de los pantalones es : "+getTalla());
		System.out.println("El largo de los pantalones : "+getLargo());
	}
}
