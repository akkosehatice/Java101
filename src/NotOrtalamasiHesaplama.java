import java.util.Scanner;

public class NotOrtalamasiHesaplama{

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Matematik Notunu Giriniz ");
		int matematik = input.nextInt();
		System.out.println("Fizik Notunu Giriniz ");
		int fizik = input.nextInt();
		System.out.println("Kimya Notunu Giriniz ");
		int kimya = input.nextInt();
		System.out.println("Türkçe Notunu Giriniz ");
		int turkce = input.nextInt();
		System.out.println("Tarih Notunu Giriniz ");
		int tarih = input.nextInt();
		System.out.println("Müzik Notunu Giriniz ");
		int muzik = input.nextInt();
		float ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;
		System.out.println("Ortalamanız : "+ ortalama);
		System.out.println(ortalama<=60 ? "Sınıfta Kaldı" : "Sınıfı Geçti" );

	}

}
