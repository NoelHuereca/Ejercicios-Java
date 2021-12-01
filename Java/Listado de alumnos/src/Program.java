import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*@Autor Hugo Noel Huereca Barba
 * Universidad UTEL
 * Matricula: 010226749
 * Fecha: 29/11/2021 
*/
public class Program {

	public static void main(String[] args) throws IOException{
		//Atributos
		String n , s;
		int e, c;
		
		//Manera manual 
		String[] nombre = {"Luis Juan Rodriguez Mena","Erika Vianey López Mendez","Juan Luis Guerra Liceo","Luisa Maria Baez del Muro"};
		int[] edad = {35,35,56,43};
		char[] sexo = {'M','F','M','F'};
		
		//Imprime datos en pantalla
		System.out.println("Listado de alumnos ingresados de manera directa al arreglo:\n");
		for(int i = 0; i < 4 ;i++) {
			System.out.println("Alumno "+ (i+1) +":");
			System.out.println("Nombre: "+ nombre[i]);
			System.out.println("Edad: "+edad[i]);
			System.out.println("Sexo: "+sexo[i]);
			System.out.println("");
		}
		
		//Manera automatica
		Scanner leer = new Scanner(System.in);
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingreso de datos de los alumnos a traves del teclado.");
		System.out.println("¿Cuantos alumnos vas a ingresar?");
		c = leer.nextInt();
		Alumno[] alumno = new Alumno[c];
		for(int i = 0;i < alumno.length ;i++) {
			System.out.println("Ingrese el nombre del alumno "+(i+1)+":");
			n = read.readLine();
			System.out.println("Ingresa la edad del alumno "+(i+1)+":");
			e = leer.nextInt();
			System.out.println("Ingrese el sexo del alumno "+(i+1)+":");
			s = leer.next();
			System.out.println("");
			alumno[i] = new Alumno(n,e,s);
		}
		//Imprime datos en pantalla
		for(int i = 0; i < c; i++) {
			System.out.println("Alumno "+(i+1)+" en el indice "+i+" del arreglo:");
			alumno[i].Desplegar();
			System.out.println("");
		}
	}
}

