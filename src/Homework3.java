import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        massive1();
        massive2();
        massive3();
        twoDimensionalMassive();
        System.out.println(Arrays.toString(initialValueMassive()));
        minMaxMassive();
        System.out.println(sumLeftRightMassive());
        cyclicOffset();

    }

    // Задание 1
    public static void massive1() {
        int[] mas = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == 0) {
                mas[i] = 1;
                System.out.print(mas[i] + " ");
            } else {
                mas[i] = 0;
                System.out.print(mas[i] + " ");
            }
        }
    }

    // Задание 2
    public static void massive2() {
        int[] mas = new int[100];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (i + 1);
            if (i % 5 == 0) {
                System.out.println();
            }
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }

    // Задание 3
    public static void massive3() {
        int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 6) {
                mas[i] = mas[i] * 2;
            }
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }

    // Задание 4
    public static void twoDimensionalMassive() {
        int[][] twoMas = new int[9][9];
        for (int i = 0; i < twoMas.length; i++) {
            for (int j = 0; j < twoMas.length; j++) {
                if (i == j || i + j == twoMas.length - 1) {
                    twoMas[i][j] = 1;
                }
                System.out.print(twoMas[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Задание 5
    public static int[] initialValueMassive() {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int initialValue = scanner.nextInt();
        int[] mas = new int[len];
        for (int i = 0; i < len; i++) {
            mas[i] = initialValue;
        }
        return mas;
    }

    // Задание 6*
    public static void minMaxMassive() {
        int[] mas = new int[15];
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(99);
        }
        int max = mas[0];
        int min = mas[0];
        for (int ma : mas) {
            if (ma > max) {
                max = ma;
            }
            if (ma < min) {
                min = ma;
            }
        }
        System.out.println("Минимальный элемент массива = " + min);
        System.out.println("Максимальный элемент массива = " + max);
    }

    // Задание 7**
    public static boolean sumLeftRightMassive() {
        boolean flag = false;
        int[] mas = new int[15];
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(99);
            System.out.print(mas[i] + " ");
        }
        int sum = Arrays.stream(mas).sum();
        int leftSum = mas[0];
        for (int i = 0; i < mas.length - 1; i++) {
            if (leftSum != sum - leftSum) {
                leftSum = leftSum + mas[i + 1];
            } else {
                flag = true;
            }
        }
        return flag;
    }

    // Задание 8*** - Сделала не до конца, а списывать не стала:)
    public static void cyclicOffset() {
        Random random = new Random();
        int n = random.nextInt(5);
        System.out.println("Необходимо сдвинуть цикл на " + n + " элементов влево");
        int[] mas = new int[5];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(30);
        }
        System.out.print(Arrays.toString(mas) + " ");
        System.out.println();
        for (int t = 0; t <= n; t++) ;
        {
            int firstEl = mas[0];
            for (int i = 0; i < mas.length - 1; i++) {
                mas[mas.length - 1] = mas[mas.length - 1 - i];
            }
            mas[1] = firstEl;

        }
        System.out.print(Arrays.toString(mas) + " ");
    }

}
