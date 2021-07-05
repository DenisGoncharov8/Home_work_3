import java.util.Arrays;

public class Home_work_3 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        interArray();
        System.out.println("Задание 2");
        oneArray();
        System.out.println("Задание 3");
        numbersArray();
        System.out.println("Задание 4");
        doubleMassiv();

        //System.out.println("Задание 5");
        //twoMethods();


    }

    /*
        Задание 1
        Задать целочисленный массив, состоящий из элементов 0 и 1.
        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        С помощью цикла и условия заменить 0 на 1, 1 на 0;
         */
    public static void interArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.print(arr[i] + 0 + " ");
        }
        System.out.println();
    }

    /*
       Задание 2
       Задать пустой целочисленный массив длиной 100.
       С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        */
    public static void oneArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i + 1);
        }
        System.out.println(Arrays.toString(arr));
    }

    /*
        Задание 3
        Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
         */
    public static void numbersArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] < 6) ? (arr[i] * 2) : arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    /*
        Задание 4
        Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
        если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
        индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
         */
    public static void doubleMassiv() {
        int counter = 1;
        int[][] table = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                table[i][j] = counter;
                System.out.print(table[i][j] + " ");
                counter++;
            }
            System.out.println();

        }
    }
}
    /*
        Задание 5
        Написать метод, принимающий на вход два аргумента:
        len и initialValue, и возвращающий одномерный массив типа int длиной len,
        каждая ячейка которого равна initialValue;
         */
  //public static void twoMethods() {
//  int initialValue = 100;
// int size = 60;
// int[] result = new int[length];
// for (int i = 0; i < result.length; i++)
//  {
//      result[i] = initialValue;
//  }
//  return result;

// int[] fourthArray = twoMethods(initialValue, size);
//  System.out.println(Arrays.toString(fourthArray));
//}










