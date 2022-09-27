package lab1.task3;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int summ = 0;
        int[] intArray = new int[n];
        for (int i = 0; i < n; i++){
            intArray[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++){
            summ += intArray[i];
        }

        float average = summ / n;
        System.out.println(summ);
        System.out.println(average);

    }
}
