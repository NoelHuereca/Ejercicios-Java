

public class SalonDeClases {

	public static void main(String[] args) {
		//Lista inicial de alumnos
		Alumno[] alumno = new Alumno[5];
		System.out.println("La clase tiene espacio para "+alumno.length+" alumnos");
		
		alumno[0] = new Alumno(1,"Alejandro");
		alumno[1] = new Alumno(2,"Brenda");
		alumno[2] = new Alumno(3,"Carlos");
		alumno[3] = new Alumno(4,"Daniela");
		alumno[4] = new Alumno(5,"Erick");
		
		//Imprime en pantalla la lista
		for (int i = 0; i < alumno.length; i++) {
			alumno[i].ImprimirAlumno();
		}
		
		//Lista con espacio aumentado
		Alumno[] alumnoV2 = new Alumno[7];
		System.out.println("la clase tiene espacio para "+alumnoV2.length+" alumnos");
		for(int i = 0;i<alumno.length;i++) {
			alumnoV2[i] = alumno[i];
		}
		//Añadir alumnos nuevos
		alumnoV2[5] = new Alumno(6,"Fernando");
		alumnoV2[6] = new Alumno(7,"Gissel");
		alumno = alumnoV2; //Actualiza el arreglo alumno con las nuevas propiedades
		
		//Imprime en pantalla la lista actualizada
		for (int i = 0; i < alumno.length; i++) {
			alumno[i].ImprimirAlumno();
		}
		
		//Eliminar alumno
		int posicion = 2; //Indice a eliminar
		for(int i = posicion;i < alumno.length-1;i++) {
			alumno[i] = alumno[i+1];
			alumno[i].numeroLista += -1;
		}
		
		//Lista con espacio disminuido
		Alumno[] alumnoV3 = new Alumno[6];
		System.out.println("La clase tiene espacio para "+alumnoV3.length+" alumnos");
				
		for(int i = 0;i < alumnoV3.length;i++) {
			alumnoV3[i] = alumno[i];
		}
		alumno = alumnoV3; //Actualiza el arreglo alumno con las nuevas propiedades
		
		//Imprime en pantalla la lista actualizada
		for(int i = 0;i<alumno.length;i++) {
			alumno[i].ImprimirAlumno();
		}
	}
}
