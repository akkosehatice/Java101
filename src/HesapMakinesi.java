import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("İşlemi Seçiniz : ");
		char islem = input.next().charAt(0);
		System.out.println("Birinci Sayıyı Giriniz : ");
		int sayi1 = input.nextInt();
		System.out.println("İkinci Sayıyı Giriniz : ");
		int sayi2 = input.nextInt();
		
		switch(islem) {
		case '+':
			System.out.println("Sayıların Toplamı : "+(sayi1+sayi2));
			break;
		case '-':
			System.out.println("Sayıların Farkı : "+(sayi1-sayi2));
			break;
		case '*':
			System.out.println("Sayıların Çarpımı : "+(sayi1*sayi2));
			break;
		case '/':
			System.out.println("Sayıların Bölümü : "+(sayi1/sayi2));
			break;
		default :
			System.out.println("Geçersiz İşlem " );
		}
		
		}
	}
