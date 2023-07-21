package src;


import java.util.Arrays;

public class MatrisTranspozuBulma {
    public static void main(String[] args) {

        int[][] matris = {{1, 2, 6,7}, {4, 2, 11,4}, {7, 5, 6,8}};
        int[][] transpoz= new int[matris[0].length][matris.length];

        for (int i = 0; i<matris.length;i++){
            for (int j = 0;j<matris[i].length;j++){
                System.out.print(matris[i][j] + " ");
            }System.out.println();

        }System.out.println("Matrisin Tranpozu");


        for (int i = 0; i<matris[0].length;i++){
            for (int j = 0;j<matris.length;j++){
                transpoz[i][j] = matris[j][i];
                System.out.print(transpoz[i][j] + " ");
            }System.out.println();

        }

    }
}