import java.util.Scanner;

public class KuvvetBulma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Sayıyı Giriniz : ");
		int a = input.nextInt();
		System.out.println("Dördün Kuvvetleri");

		for(int i = 1 ; i<a;i*=4) {
			System.out.println(i);
		}
		System.out.println("Beşin Kuvvetleri ");
		for(int i = 1 ; i<a;i*=5) {
			System.out.println( i);
		}
	}

}
