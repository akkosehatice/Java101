import java.util.Scanner;

public class Faktoriyel {

	public static void main(String[] args) {
		   Scanner input = new Scanner(System.in);
	        int faktoriyel = 1;
	        
	        System.out.println("Bir sayi giriniz: ");
	        int sayi = input.nextInt();
	        
	        for(int i = 1; i <= sayi; i++)
	        {
	            faktoriyel = faktoriyel * i;
	        }
	        System.out.println(sayi + "!= " + faktoriyel);
	}

}
