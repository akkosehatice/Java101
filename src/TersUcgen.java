import java.util.Scanner;

public class TersUcgen {

	public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Basamak sayısını giriniz:");
        int basamak= input.nextInt();
        for (int i =basamak; i >= 1; i--) {
            for (int j = 0; j <basamak- i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}

}
