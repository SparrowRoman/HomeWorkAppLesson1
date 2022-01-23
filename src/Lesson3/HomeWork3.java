package Lesson3;

import java.util.Arrays;

public class HomeWork3 {

    public static void main(String[] args) {
        replacing();
        fillUpDo();
        arrayLessSix();

        mission5(5, 3);


        /*
4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
* и с помощью цикла(-ов) заполнить его диагональные элементы единицами
* (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей
* можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
*/
        System.out.println();

        int[][] array4 = new int[5][5];
        array4[0][0] = 1;
        array4[1][1] = 1;
        array4[2][2] = 1;
        array4[3][3] = 1;
        array4[4][4] = 1;
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                System.out.printf("%5d", array4[i][j]);
            }
            System.out.println();
        }

    }


    /* 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     *Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    static void replacing() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.print(array[i] * 0 + "  ");
            } else {
                System.out.print(array[i] + 1 + "  ");
            }
        }
        System.out.println();
        System.out.println();
    }

    // 2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    static void fillUpDo() {
        int[] array2 = new int[101];
        for (int i = 1; i < array2.length; i++) {
            array2[i] = i;
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    //  3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    static void arrayLessSix() {
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(array3));
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) {
                System.out.print(array3[i] * 2 + "  ");
            } else {
                System.out.print(array3[i] + "  ");
            }
        }
        System.out.println();
        System.out.println();


    }

  static int mission5(int len, int initialValue) {
      int[] array5 = new int[len];
      array5[len-1] = initialValue;
      array5[len-2] = initialValue;
      array5[len-3] = initialValue;
      array5[len-4] = initialValue;
      array5[len-len] = initialValue;
      for (int i = 0; i < array5.length; i++) {
          System.out.println(array5[i]);
      }
      return array5[initialValue];
  }



}

