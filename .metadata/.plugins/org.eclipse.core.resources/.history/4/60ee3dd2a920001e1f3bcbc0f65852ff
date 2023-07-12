import java.util.Scanner;

public class SayilarinOrtalamasi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sayi = input.nextInt();
		int toplam = 0;
		int sayac = 0;
		
		
		for(int i = 1; i <= sayi;i++) {
			if((i%3 == 0) & (i%4 == 0)) {
				System.out.println(i);
				toplam +=i;
				sayac++;
			}
		}
		double ortalama = toplam/sayac;
		System.out.println("Sayıların ortalaması : "+ ortalama);
	}

}
