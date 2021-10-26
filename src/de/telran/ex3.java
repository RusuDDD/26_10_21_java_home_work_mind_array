package de.telran;

public class ex3 {
    public static void main(String[] args) {
        int[] array = {7, 5, 8, 6};
        changesOddTo0(array);
        /*
        3.	Функция принимает одномерный массив и меняет все элементы с нечетными индексами на 0.
         */
    }

    static boolean changesOddTo0(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            if (array[i] < 0) {
                temp += 0;
            }
        }
        return true;
    }
}
