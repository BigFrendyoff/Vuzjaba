package lab1.task4;

import java.util.Scanner;

public class ArraySumWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = 0;
        int summ1 = 0;
        int summ2 = 0;
        int maxx = 0;
        int[] intArray = new int[n];
        for (int i = 0; i < n; i++){
            intArray[i] = in.nextInt();
        }
        int minn = intArray[0];
        while (q < n){
            summ1 += intArray[q];
            if (intArray[q] < minn){
                minn = intArray[q];
            }
            if (intArray[q] > maxx){
                maxx = intArray[q];
            }
            q++;
        }

    }
}
