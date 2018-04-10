package prak16;

public class Fakultaet {

	public static long berechneFakultaet(long n) {
		if(n == 0){
			return 1;
		}
		return berechneFakultaet(n-1)*n;
	}
	
	public static void main(String[] args) {
		System.out.println(berechneFakultaet(5));
	}
}
