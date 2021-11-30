package Class;

public class Celular {	//Declaracion de clase Celular
	//Atributos
	String marca = "Motorola G7 plus",
		   color = "Negro",
		   procesador = "Snapdragon 636",
		   grafica = "Adreno",
		   contacto = "default";
	double tamañoPantalla = 6.2,
		   peso = 176.0,
		   camaraFrontal = 5.0,
		   camaraTrasera = 13.0;
	long numero = 0;
	
	//Metodos
	public void Encender() //Enciende el celular
	{
		System.out.println("Encendiendo..");
		System.out.println("Encendido!");
	}
	
	public void DesbloquearPantalla() //Desbloquea la pantalla
	{
		System.out.println("Pantalla desbloqueada");
	}
	
	public void Mensajear(String Contacto, String Texto) //Mensajea contacto
	{
		System.out.println("Enviar nuevo mensaje..");
		System.out.printf("Para : "+ Contacto);
		System.out.printf("\nMensaje: "+ Texto+"\n");
		System.out.println("Mensaje enviado!");
	}
	
	public void BloquearPantalla()	//Bloquea la pantalla 
	{
		System.out.println("Pantalla Bloqueada");
	}
	
	
	
	

	public Celular(String con) {
		contacto = con;
	}
	
	public Celular(int num) {
		numero = num;
	}
}
