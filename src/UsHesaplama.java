
public class UsHesaplama {
	public static int us(int a, int b) {
		if(a==0) {
			return 1;
		}
		else if(b==0) {
			return 1;
		}else{
			return a* us(a,b-1);
		}
	}
	public static void main(String[] args) {
		System.out.println(us(2,3));
	}

}
