import java.util.Random;

public class Kaulins {
	static void mestkaulinu(){
		int s;
		Random rand = new Random();
		s = rand.nextInt(6)+1;
		System.out.println("Uzkrita skaitlis: "+s);
	}

	public static void main(String[] args) {
		mestkaulinu();
	}

}
