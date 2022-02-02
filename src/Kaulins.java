
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.List;

public class Kaulins {
	static int mestKaulinu() {
		Random rand = new Random();
		int skaitlis = rand.nextInt(6)+1;
		return skaitlis;
		
	}
	
	
	public static void main(String[] args) {
		int reizes, izvele, lielakais=0;
		List<Integer> pedejie = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("1-Mest kaulinu | 2 - Apskatit pedejos metienus | 3 - Apskatit pedejo lielako skaitli |4 - Apturet");
			izvele = scan.nextInt();
				
			
			
			switch(izvele){
			case 1:
				do{
					System.out.println("Cik reizes mest kaulinu?");
					reizes = scan.nextInt();
				}while(reizes<1);
				for(int i=0; i<reizes; i++){
					pedejie.add(mestKaulinu());
				}
				break;
			case 2:
				System.out.println("Pedeja metiena skaitli ir ");
				for(Integer i: pedejie){
					System.out.print(i+" ");
				}
				System.out.println();
				break;
			case 3:
				for(int i=0; i<pedejie.size(); i++){
					if(pedejie.get(i)>lielakais){
						lielakais = pedejie.get(i);
					}
				}
				System.out.println("Lielakais skaitlis pedeja metiena ir "+lielakais);
			    break;
			case 4:
				System.out.println("Programma aptureta");
				break;
			}
		}while(izvele!=4);
		scan.close();
	}

}
