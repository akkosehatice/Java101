import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Mesafeyi KM Cinsinden Giriniz : ");
		int mesafe = input.nextInt() ;
		System.out.println("Yaşınızı Giriniz : ");
		int yas = input.nextInt();
		System.out.println("Yolculuk Tipinizi Seçiniz ");
		System.out.println(" 1- Tek Yön \n " + "2- Gidiş-Dönüş");
		int tip = input.nextInt();
		double normalTutar = mesafe*0.10;		
		
		if(yas >0 && mesafe >0 & ((tip == 1)|| (tip==2))) {
			if(yas<12) {
				normalTutar = normalTutar / 2 ; 
			}
			else if(yas>12 && yas< 24) {
				normalTutar = normalTutar - ( normalTutar*0.10);
			}
			else if (yas>65){
				normalTutar = normalTutar - (normalTutar*0.30);
			}
		}else {
			System.out.println("Hatalı Veri Girdiniz ! ");
		}
		
		if(tip==2) {
			normalTutar = normalTutar-(normalTutar *0.20);
		}
		if(normalTutar>0) {
			System.out.println("Toplam Tutar : " + normalTutar);

		}
	}

}
