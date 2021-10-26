package de.telran;

public class Main {

    public static void main(String[] args) {
        //1.	Создать двумерный массив 10x10 и заполнить его числами от 99 до 0 (в методе main)
        int[][] arrayTenByTen = new int[10][10];
        for (int i = 0; i < arrayTenByTen.length; i++) {
            for (int j = 0; j < arrayTenByTen[i].length; j++) {
                arrayTenByTen[i][j] = i * 10 + j;
                arrayTenByTen[i][j] = arrayTenByTen[i].length - 1 - j;     //i * 10 + j;
                System.out.print(arrayTenByTen[i][j]);
            }
            System.out.println();
        }
    }
}
