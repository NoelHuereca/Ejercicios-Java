package entidades;

public class Calcetines extends Prenda{
	//Atributos
	private char codigoColor = 'N';
	
	//Metodos
	public void setCodigoColor(char c) {
		codigoColor = c;
	}
	
	public char getCodigoColor() {
		return codigoColor;
	}
	
	//sobreescritura de metodo
	public void desplegarInformacion() {
		System.out.println("El ID de los calcetines es : "+getId());
		System.out.println("La descripcion de los calcetines es : "+getDescripcion());
		System.out.println("El precio de los calcetines es : $"+getPrecio());
		System.out.println("El codigo de color de los calcetines es : "+getCodigoColor());
		System.out.println("La cantidad en existencia de calcetines es : "+getExistencia());
	}
}
