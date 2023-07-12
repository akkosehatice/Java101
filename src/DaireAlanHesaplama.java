import java.util.Scanner;

public class DaireAlanHesaplama {

	public static void main(String[] args) {
		int r,a;
		double pi = 3.14;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Dairenin yarı çapını giriniz : ");
		r = input.nextInt();
		a = input.nextInt();
		double alan = pi*r*r;
		double cevre = 2*pi*r;
		double daireDilimiAlanı = (pi*(r*r)*a)/360;
		
		System.out.println(" Alan : " + alan);
		System.out.println(" Çevre : " + cevre);
		System.out.println(" Daire Dilimi Alanı : " + daireDilimiAlanı);

		
		
	}

}
