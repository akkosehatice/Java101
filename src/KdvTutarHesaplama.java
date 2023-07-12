import java.util.Scanner;

public class KdvTutarHesaplama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double kdvOrani, tutar, kdvTutar ; 
		System.out.println("Ücret Tutarını Giriniz : ");
		tutar = input.nextDouble();
		kdvOrani = tutar < 100 ? tutar* 0.18 : tutar* 0.08;
		kdvTutar = tutar + kdvOrani;
		
		System.out.println("Tutar : "+ tutar);
		System.out.println("KDV Oranı : "+ kdvOrani);
		System.out.println("KDV'li Fiyatı : "+ kdvTutar);


	}

}
