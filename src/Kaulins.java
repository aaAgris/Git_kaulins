import java.util.Random;

public class Kaulins {
	static void mestkaulinu(int reizes){
		int s;
		Random rand = new Random();
		for(int i =1; i<=reizes;i++){
		s = rand.nextInt(6)+1;
		System.out.println("Uzkrita skaitlis: "+s);
	}
	}

	public static void main(String[] args) {
		mestkaulinu(3);
	}

}
