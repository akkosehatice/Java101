import java.util.Scanner;

public class MukemmelSayi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Sayıyı Giriniz : ");
		int a = input.nextInt();
		int toplam = 0;
		
		for(int i = 1 ; i<a;i++) {
			if(a%i==0) {
				toplam+=i;
			}
		}
		if(toplam==a) {
			System.out.println("Sayı Mükemmel Sayıdır ");
		}
		else {
			System.out.println("Sayı Mükemmel Sayı Değildir ");

		}
	}

}
