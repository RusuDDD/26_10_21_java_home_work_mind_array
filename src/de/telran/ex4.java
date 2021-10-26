package de.telran;

public class ex4 {
    public static void main(String[] args) {
      /*
      4.	Функция принимает двумерный массив
       и возвращает да или нет, есть ли отрицательные элементы в нем. static boolean function (int[][] arr)
       */
        int[][] array = new int[][]{{15, 8, -7, 9, -6}, {-3, -8, 7, 5, 6}};
        System.out.println(negativeValues(array));

    }

    static boolean negativeValues(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] < 0)
                    return true;
            }
        }
        return false;
    }
}