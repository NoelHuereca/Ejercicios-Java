
public class Base_Elevada_N_Exponente {

	public static void main(String[] args) {
		// Creacion del arreglo de 15 elementos
		int arreglo[] = new int[15];
		// Inicializacion del arreglo con el algoritmo de 2n
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = (int) Math.pow(2, i);
		}
		// Imprimiendo el arreglo
		for (int i = 0; i < arreglo.length; i++) {
			System.out.printf("Arreglo[%d]: %d \n", i, arreglo[i]);
		}
	}

}
