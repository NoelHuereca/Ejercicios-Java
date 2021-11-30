
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sombrero sombrero1 = new Sombrero("Negro", "Chica", "Texano");	//Color, Talla, Modelo
		sombrero1.Descolgar();
		sombrero1.Limpiar();
		sombrero1.Poner();
		sombrero1.Quitar();
		sombrero1.Colgar();
		System.out.println("------------------------------\n");
		Sombrero sombrero2 = new Sombrero("Blanco", "Mediana", "Vaquero");	//Color, Talla, Modelo
		sombrero2.Descolgar();
		sombrero2.Limpiar();
		sombrero2.Poner();
		sombrero2.Quitar();
		sombrero2.Colgar();
		System.out.println("------------------------------\n");
		Sombrero sombrero3 = new Sombrero("Cafe", "Grande", "Boina");	//Color, Talla, Modelo
		sombrero3.Descolgar();
		sombrero3.Limpiar();
		sombrero3.Poner();
		sombrero3.Quitar();
		sombrero3.Colgar();
	}

}
