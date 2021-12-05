package entidades;

public class Camisa extends Prenda{
	//Atributo
	private char codigoColor = 'N';
	private float cuello =  0.0f;
	private String talla = "N/A";
	
	//Metodos
	public void setCodigoColor(char c) {
		codigoColor = c;
	}
	
	public char getCodigoColor() {
		return codigoColor;
	}
	
	public void setCuello(float c) {
		cuello = c;
	}
	
	public float getCuello() {
		return cuello;
	}
	
	public void setTalla(String t) {
		talla = t;
	}
	
	public String getTalla() {
		return talla;
	}
	
	//Sobreescritura de metodos
	public void desplegarInformacion() {
		System.out.println("El ID de la camisa es : "+getId());
		System.out.println("La descripcion de la camisa es : "+getDescripcion());
		System.out.println("El codigo de color de la camisa es : "+getCodigoColor());
		System.out.println("La talla de la camisa es : "+getTalla());
		System.out.println("El precio de la camisa es : $"+getPrecio());
		System.out.println("La cantidad en existencia de camisas es : "+getExistencia());
	}
}
