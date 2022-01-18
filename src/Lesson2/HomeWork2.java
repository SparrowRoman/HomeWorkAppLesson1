package Lesson2;

public class HomeWork2 {
    public static void main(String[] args) {

        trueFalse(9, 1);

        positiveOrNegativeNumber(-5);

        missionThree(1);

        stringNumder("Строка", 10);
    }


// 1. Написать метод, принимающий на вход два целых числа и проверяющий,что их сумма лежит в пределах от 10 до 20 (включительно),
// если да – вернуть true, в противном случае – false.

    static boolean trueFalse(int a, int b) {
        int c = a + b;
        if (c > 10 && c <= 20) {
            System.out.println("Число от 10 до 20 включительно = " + c);
            return true;
        } else {
            System.out.println("Сумма чисел a и b не находятся в пределах от 10 до 20 включительно ");
            return false;
        }
    }

    //2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
// положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    static void positiveOrNegativeNumber(int x) {
        if (x >= 0) {
            System.out.println("Число положительное :  " + x);
        } else {
            System.out.println("Число отрицательное : " + x);
        }
    }

    //Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    static boolean missionThree(int y) {
        if (y >= 0) {
            System.out.println("Число положительное: " + y);
            return false;
        } else {
            System.out.println("Число отрицательное: " + y);
            return true;
        }
    }


    /*4. Написать метод, которому в качестве аргументов передается строка и число,
    метод должен отпечатать в консоль указанную строку, указанное количество раз;*/

    public static void stringNumder(String str, int j) {

        for (int f = 0; f < j; f++) {
            System.out.println(str);
        }
    }
}