
public class Alumno {
	//Atributos
	public String nombre;
	public int edad;
	public String sexo;
	
	public Alumno(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	public void Desplegar() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
		System.out.println("Sexo: "+sexo);
	}
}
