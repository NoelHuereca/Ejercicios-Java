package entidades;

public class Chamarra extends Prenda{
	//Atributos
	private byte talla = 00;
	private String material = "N/A";
	
	//Metodos
	public void setTalla(byte t) {
		talla = t;
	}
	
	public byte getTalla() {
		return talla;
	}
	
	public void setMaterial(String m) {
		material = m;
	}
	
	public String getMaterial() {
		return material;
	}
	
	//Sobreescritura de metodo
	public void desplegarInformacion() {
		System.out.println("El ID de la chamarra es : "+getId());
		System.out.println("La descripcion de la chamarra es : "+getDescripcion());
		System.out.println("El precio de la chamarra es : $"+getPrecio());
		System.out.println("La cantidad en existencia de chamarras : "+getExistencia());
		System.out.println("La talla de la chamarra es : "+getTalla());
		System.out.println("La chamarra esta hecha con : "+getMaterial());
	}
}
