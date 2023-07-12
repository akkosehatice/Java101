import java.util.Scanner;

public class CiftToplam {

	public static void main(String[] args) {
        int n, total = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Sayı giriniz: ");
            n = input.nextInt();
            if (n % 4 == 0) {
                total += n;
            }
        } while (n % 2 == 0);
        System.out.print("Sayıların toplamı: " + total);
	}

}
