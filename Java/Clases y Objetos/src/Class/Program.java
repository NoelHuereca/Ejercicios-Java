/**
 * Fecha: 28/10/2021
 */
package Class;
import Class.Celular; //Importacion de la clase celular
/**
 * @author Hugo Noel Huereca Barba
 * Matricula: 010226749
 * UNIVERSIDAD UTEL
 */
public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Celular celular = new Celular("Zaira");	//Declaracion de objeto celular tipo Celular
		System.out.println("\t\tCaracteristicas\n");
		System.out.println("Marca de mi celular: " +celular.marca+"\n"+	//Llamada a atributos de clase Celular
						   "Color:" +celular.color+"\n"+
						   "Prosesador:" +celular.color+"\n"+
						   "Grafica:" +celular.grafica+"\n"+
						   "Tamaño de pantalla:" +celular.tamañoPantalla+"\n"+
						   "Peso:" +celular.peso+"\n"+
						   "Camara frontal:" +celular.camaraFrontal+"\n"+
						   "Camara trasera:" +celular.camaraTrasera+"\n");
		
		System.out.println("\t\tFunciones\n");		//Llamada a metodos
		celular.Encender();	//Llamada a metodo Encender
		celular.DesbloquearPantalla(); //Llamada a metodo DesbloquearPantalla
		celular.Mensajear("Papá","¿Como estas?");//Metodo con parametros tipo String = (Contacto, Mensaje)
		celular.BloquearPantalla(); //Llamada a etodo BloquearPantalla
		
	}

}
