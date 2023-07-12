import java.util.Scanner;

public class KullanıcıGirisi {

	public static void main(String[] args) {
		
		String userName, password;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Kullanıcı Adınız : ");
		userName = input.nextLine() ;
		System.out.println("Şifreniz : ");
		password = input.nextLine();
		
		if(userName.equals("patika")&& password.equals("java123")) {
			System.out.println("Giriş Yaptınız !");
		}
		else if(userName.equals("patika")&& ! password.equals("java123")) {
			System.out.println("Bilgileriniz Yanlış !");
			System.out.println("Şifreyi Sıfırlamak İster misiniz ?");
			String cevap = input.nextLine();
			switch(cevap) {
			case "evet":
				System.out.println("Lütfen Yeni Şifrenizi Giriniz : ");
				String newpassword = input.nextLine();
				if(password == newpassword) {
					System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
					newpassword = input.nextLine();
				}else {
					System.out.println("Şifre Başarıyla Oluşturuldu");
				}
				break;
			case "hayır":
				System.out.println("Tekrar Deneyiniz");
				break;
			}
			
			
		}

		
		
	}

}
