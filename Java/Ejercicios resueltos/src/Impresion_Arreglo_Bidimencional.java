
public class Impresion_Arreglo_Bidimencional {

	public static void main(String[] args) {
		// Creacion del arreglo bidimencional de 4x4
		int arreglo [][] = new int [4][4];
		// Inicializamos arreglo usando dos indices
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo[i].length; j++) {
				arreglo[i][j] = i + j;
			}
		}
		// Imprimiremos arreglo usando dos indices
		for (int i = 0; i < arreglo.length; i++) {
			for(int j = 0; j < arreglo[i].length; j++) {
				System.out.printf("arreglo[%d][%d]: %d \n", i, j, arreglo[i][j]);
			}
		}
	}

}
