
public class Alumno {
	public int numeroLista;
	public String nombre;

	Alumno(int numeroLista, String nombre){
		this.numeroLista = numeroLista;
		this.nombre = nombre;
	}
	
	public void ImprimirAlumno(){
		System.out.println("Alumno "+nombre+" con numero de lista : "+numeroLista);
	}
	
	public void OrdenarLista() {
		
	}
}
