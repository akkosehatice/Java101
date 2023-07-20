package src;

import java.util.Arrays;
import java.util.Scanner;

public class EnYakinSayi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] list = {15,12,788,1,-1,-778,2,0};
        Arrays.sort(list);

        int sayi = sc.nextInt();
        int min = sayi;
        int max = sayi;

        for(int i = 0;i<list.length;i++){
            if(sayi<list[i]){
                max = list[i];
                break;
            }
        }
        for(int i = list.length -1  ; i>=0; i--){
            if (  list[i]<sayi){
                min = list[i];
                break;
            }
        }
        System.out.println("Girilen sayıdan büyük en yakın sayı :  " + max);
        System.out.println("Girilen sayıdan küçük en yakın sayı :" + min);



    }
}
