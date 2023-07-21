package src;

import java.util.Arrays;

public class ArrayFrequency {

    public static void main(String[] args) {
        int[] dizi ={10, 20, 20, 10, 10, 20, 5, 20,5};
        Arrays.sort(dizi);
        int count;

        for (int i = 0; i< dizi.length;i++){
            count = 0;
            for(int j = 0 ; j< dizi.length;j++){
                if (dizi[i] == dizi[j]){
                    count++;
                }
            }System.out.println(dizi[i] + " Sayısının Tekrar Sayısı : "+ count);
        }

    }
}
