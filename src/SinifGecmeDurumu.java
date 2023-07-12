import java.util.Scanner;

public class SinifGecmeDurumu {

	public static void main(String[] args) {		
		
		int mat, fizik, turkce, kimya, muzik;

		Scanner input = new Scanner(System.in);
		
		System.out.println("Matematik Notunuz : ");
		mat = input.nextInt();
		
		System.out.println("Fizik Notunuz : ");
		fizik = input.nextInt();
		
		System.out.println("Türkçe Notunuz : ");
		turkce = input.nextInt();
		
		System.out.println("Kimya Notunuz : ");
		kimya = input.nextInt();
		
		System.out.println("Müzik Notunuz : ");
		muzik = input.nextInt();
		
		if(mat < 0 || mat > 100 || fizik < 0 || fizik > 100 ||
                kimya < 0 || kimya > 100 || turkce < 0 || turkce > 100 || muzik < 0 || muzik > 100) {
			
			System.out.println("Lütfen Geçerli Bir Not Giriniz !");
		}
		else {
			double ortalama= (mat + fizik + turkce + kimya + muzik) / 5;
			if(ortalama<55) {
				System.out.println("Ortalamanız : "+ ortalama+" Kaldınız");
			}else {
				System.out.println("Ortalamanız : "+ ortalama+ " Geçtiniz");
			}
		}
		


	}

}
