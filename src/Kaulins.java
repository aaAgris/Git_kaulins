import java.util.Random;
import java.util.Scanner;

public class Kaulins {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int s;
		System.out.println("Cik reizes mest kauli�u?");
		int reizes = scan.nextInt();
		for(int i=1;i<=reizes;i++){
			
		Random rand = new Random();
		s = rand.nextInt(6)+1;
		System.out.println("Uzkrita skaitlis: "+s);
		
		}
		}
		

}
