import java.util.Scanner;
public class mesiu {
	public static void main(String[] args) {
		int alumAmount;
		int alumMin = 1;
		int knoAmount;
		int knoMin = 3;
		int sulfAmount;
		int sulfMin = 2;
		int carbAmount;
		int carbMin = 2;
		
	System.out.println("Hai asa!");
	System.out.println("ini script java mesiu");
	System.out.println("berapa gram Alimunium mu?");
	
	Scanner userInput;
	userInput = new Scanner(System.in);
	alumAmount = userInput.nextInt();
	
	
	System.out.println("berapa gram Kalium Nitrat mu?");
	userInput = new Scanner(System.in);
	knoAmount = userInput.nextInt();
	
	System.out.println("berapa gram Carbon yang disediakan mu?");
	userInput = new Scanner(System.in);
	carbAmount = userInput.nextInt();
	
	
	System.out.println("berapa gram Sulfur yang kau punya?");
	userInput = new Scanner(System.in);
	sulfAmount = userInput.nextInt();
	System.out.println("oh , kau punya " + alumAmount + " gram Aluminium " + knoAmount + " gram KNO3 "+ carbAmount + " gram karbon dan " + sulfAmount + " gram sulfur " );
	System.out.println("kali ini , mesiu yang dibuat memiliki komposisi Al:KNO3:C:S sebanyak 1:3:2:2");
	//calculating go!
	if(alumAmount < alumMin || sulfAmount < sulfMin || carbAmount < carbMin || knoAmount < knoMin){
		System.out.println("sayang nya , bahannya tidak cukup untuk sebungkus mesiu");
	}
	//lets int smallest
	int terkecil;
	if (alumAmount <= sulfAmount && alumAmount <= knoAmount && alumAmount <= carbAmount ){
		terkecil = alumAmount;
		}else if (sulfAmount <= alumAmount && sulfAmount <= knoAmount && sulfAmount <= carbAmount){
			terkecil = sulfAmount;
		}else if (knoAmount <= alumAmount && knoAmount <= sulfAmount && knoAmount <= carbAmount){
			terkecil = knoAmount;
		}else { terkecil = carbAmount;
		}
	if (terkecil >= 1){System.out.println("kau dapat membuat " + terkecil + " bungkus mesiu ");
	// terkecil have done now go show
		System.out.println("kau butuh " + terkecil*alumMin + " gram Alimunium");
		System.out.println("kau butuh " + terkecil*carbMin + " gram Karbon");
		System.out.println("kau butuh " + terkecil*knoMin + " gram KNO3");
		System.out.println("kau butuh " + terkecil*sulfMin + " gram Sulfur");}else{
		System.out.println("kau butuh lebih banyak bahan untuk membuat 1 bungkus mesiu");
		}
	}
}
