
public class Arreglo {
	private int arr[];
	private int n;
	private int tope;
	
	public Arreglo(int n) {
		this.n = n;
		arr = new int[n];
		tope = 0;
	}
	
	public Arreglo(int a[]) {
		arr = a;
		n = arr.length;
		tope = n;
	}
	
	private boolean isFull() {
		return tope == n;
	}
	
	private boolean isEmpty() {
		return tope == 0;
	}
	
	public boolean add(int num) {
		if(isFull()) {
			return false;
		}
		arr[tope] = num;
		tope++;
		return true;
	}
	
	public boolean add(int num, int pos) {
		if(isFull()) {
			return false;
		}
		
		if(pos > tope) {
			return false;
		}
		
		for(int i = tope; i > pos; i--) {
			arr[i] = arr[i - 1];
		}
		
		arr[pos] = num;
		tope++;
		return true;
	}
	@Override
	public String toString() {
		String aux = "";
		for(int i = 0; i < tope; i++) {
			aux = aux + arr[i] + "\t";
		}
		return aux;
	}
	
}
