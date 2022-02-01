import java.util.Random;
import java.util.Scanner;

public class Kaulins {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int s,lielakais=0;
		System.out.println("Cik reizes mest kauliòu?");
		int reizes = scan.nextInt();
		Random rand = new Random();
		for(int i=1;i<=reizes;i++){
		s = rand.nextInt(5)+2;
		System.out.println("Uzkrita skaitlis: "+s);
		if(s>lielakais){
			lielakais = s;
		}
		
		
	}
		System.out.println("Lielakais skaitlis ir : "+lielakais);
	}

}
