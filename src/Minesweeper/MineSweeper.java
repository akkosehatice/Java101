package src.Minesweeper;

import java.util.Arrays;
import java.util.Scanner;

public class MineSweeper {
    int row , col, mineCount, randRow, randCol, moveCount;
    String[][] map ;
    String[][] gameMap;


    public MineSweeper(int row, int col){
        this.row = row;
        this.col = col;
        this.map = new String[row][col];
        this.gameMap = new String[row][col];
        System.out.println("***********************************************************");
        fill();
        print(this.map);
        System.out.println("***********************************************************");
        print(gameMap);
        System.out.println("***********************************************************");
        mine();
        print(this.map);
        run();


    }

    public void fill(){
        for(int i=0; i<map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = " - ";
                gameMap[i][j] = " - ";
            }
        }
    }

    public void print(String[][] arr){
        for(int i=0; i<arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void mine(){
        this.mineCount = (this.row * this.col )/4;
        this.moveCount = (this.row * this.col) - this.mineCount;
        for (int i = 0;i<mineCount;i++){
            randRow = (int) (Math.random() * map.length);
            randCol = (int) (Math.random() * map[0].length);
            map[randRow][randCol] = " * ";
        }
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        while (this.moveCount>0){
            System.out.println("Enter a Row Number : ");
            int gameRow = scanner.nextInt();
            System.out.println("Enter a Column Number : ");
            int gameCol = scanner.nextInt();
            if ((gameRow <0 || gameRow>gameMap.length) && (gameCol<0 || gameCol>gameMap[0].length)){
                System.out.println(" Please Enter a Valid Number !");
                System.out.println("Enter a Row Number : ");
                gameRow = scanner.nextInt();
                System.out.println("Enter a Column Number : ");
                gameCol = scanner.nextInt();
            } else if (map[gameRow][gameCol] == " * ") {
                System.out.println("Game Over, You Lose !!");
                break;
            } else if (map[gameRow][gameCol] == " - ") {
                this.gameMap[gameRow][gameCol] = " 1 ";
                this.moveCount--;
                if (this.moveCount == 0){
                    System.out.println("Congratulations You Win the Game !!");
                }

            }

            print(gameMap);
        }

    }


}















