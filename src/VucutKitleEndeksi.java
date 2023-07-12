import java.util.Scanner;

public class VucutKitleEndeksi {

	public static void main(String[] args) {
		double boy, kilo ;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lütfen Boyunuzu (metre türünde) Giriniz : ");
		boy = input.nextDouble();
		System.out.println("Lütfen Kilonuzu Giriniz : ");
		kilo = input.nextDouble();
		double vke = kilo / (boy*boy);
		System.out.println("Vücut Kitle Endeksi : " + vke);



	}

}
