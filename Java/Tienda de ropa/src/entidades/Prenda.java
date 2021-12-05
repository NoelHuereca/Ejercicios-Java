// : ;
package entidades;
public class Prenda {
	//Atributos
	private int id = 0; 
	private int existencia = 0;
	private float precio = 0.0f;
	private String descripcion = "-Sin descripcion-";
	private static int contadorInstancia = 1;
	
	//Constructor
	public Prenda(){
		id = contadorInstancia * 3;
		contadorInstancia++; 
	}
	
	//Metodos
	public int getId(){
		return id; 
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion; 
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}
	
	public int getExistencia() {
		return existencia;
	}
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public float getPrecio() {
		return precio;
	}
	
	public void desplegarInformacion() {
		System.out.println("El ID de la prenda es : "+id);
		System.out.println("La descripcion de la prenda es : "+descripcion);
		System.out.println("Precio : $"+precio);
		System.out.println("Existencias : "+existencia);
	}
}
