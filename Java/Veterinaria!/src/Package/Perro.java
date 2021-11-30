package Package;

public class Perro {
	private int edad = 0;
	private String nombre = "Perro";
	private float peso = 1.0f;
	
	public int edadHumana() {
		return edad * 7;
	}
	
	public void alimentar(int tipoDeComida) {
		if(tipoDeComida == 0) {
			System.out.println("Soy un perro comiendo carne");
		}
		else {
			System.out.println("Soy un perro comiendo croquetas");
		}
	}
	
	public String Interactuar() {
		return "Guau";
	}
	
	public void imprimirInformacion() {
		System.out.println("Soy un perro con "+edad+" años, y me llamo: "+nombre);
	}
	
	//Constructor
	Perro(int pEdad, String pNombre, float pPeso){
		edad = pEdad;
		nombre = pNombre;
		peso = pPeso;
	}
}
