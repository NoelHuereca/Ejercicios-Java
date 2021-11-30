import java.util.Random;

public class Program {

	public static void main(String[] args) {
		Random rd = new Random();
		Arreglo a = new Arreglo(20);
		
		for(int i = 0; i < 15; i++) {
			int num = rd.nextInt(100);
			if(a.add(num)) {
				System.out.println("Adiciono "+num);
			}
			else {
				System.out.println("No pudo adicionar "+num);
			}
		}
		
		a.add(500, 0);
		a.add(600, 0);
		
		System.out.println(a);
	}
}