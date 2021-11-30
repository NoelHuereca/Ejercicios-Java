/**
 * 
 */
package Class;
import Class.Celular;
/**
 * @author Hugo Noel Huereca Barba
 * matricula: 010226749
 * fecha: 28/10/2021
 */
public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Celular celular = new Celular(); //creacion de objeto celular de tipo Celular
		System.out.println("\t\tCaracteristicas\n");
		System.out.println("Marca de mi celular: " +celular.marca+"\n"+	//Llamada a atributos de clase Celular
						   "Color:" +celular.color+"\n"+
						   "Prosesador:" +celular.color+"\n"+
						   "Grafica:" +celular.grafica+"\n"+
						   "Tamaño de pantalla:" +celular.tamañoPantalla+"\n"+
						   "Peso:" +celular.peso+"\n"+
						   "Camara frontal:" +celular.camaraFrontal+"\n"+
						   "Camara trasera:" +celular.camaraTrasera+"\n");
		
		System.out.println("\t\tFunciones\n");
		celular.Encender();	//Llamada a metodo encender
		celular.Mensajear("Papá","¿Como estas?");//Llamada a metodo con parametros tipo String = (Contacto, Mensaje)
		celular.BloquearPantalla();
	}

}
