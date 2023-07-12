import java.util.Scanner;

public class DıkUcgendeHipotenus {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int a,b;
		double c, cevre,u,alan ;
		System.out.println("1. Kenarı Giriniz : ");
		a = input.nextInt();
		System.out.println("2. Kenarı Giriniz : ");
		b = input.nextInt();
		c = Math.sqrt((a*a)+(b*b));
		System.out.println("Hipotenüs : "+ c);
		
		cevre = a+b+c;
		u = cevre /2;
		alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
		
		System.out.println("Üçgenin Çevresi : " + cevre);
		System.out.println("Üçgenin Alanı : "+ alan);
		
	}

}
