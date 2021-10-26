package de.telran;

public class ex2 {
    public static void main(String[] args) {
        int[] array = new int[99];

         arraymMltipliesBy3(array);
        printarray(array);
        /*
        2.	Функция принимает одномерный массив и умножает
         на 3 все его положительные элементы. static void function(int[] arr)
         */
    }

    static void printarray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

       System.out.println();
    }

        static void arraymMltipliesBy3 ( int[] array){
        for (int i = 0; i < array.length; i++) {

            array[i] = 3 * i;

        }
    }
    }