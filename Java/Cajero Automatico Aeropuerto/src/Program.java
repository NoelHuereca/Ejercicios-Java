
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cajero cajero = new Cajero();
		while(true) {
			cajero.PedirHoras();
			cajero.Cobrar();
			cajero.Cambio();
		}
	}
}
