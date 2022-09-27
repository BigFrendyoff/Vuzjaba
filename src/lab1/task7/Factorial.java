package lab1.task7;

import java.util.Scanner;

public class Factorial {

    public static int calculateFactorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(calculateFactorial(in.nextInt()));
    }


}
