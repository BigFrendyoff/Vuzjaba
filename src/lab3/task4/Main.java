package lab3.task4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        Random random = new Random();
        int n = 0;
        while (true){
            n = in.nextInt();
            if (n > 10){
                break;
            }
            else{
                System.out.println("Введено неверное число...");
            }
        }
        for (int i = 0; i < n; i++){
            numbers.add(random.nextInt(0, n));
        }
        System.out.println(numbers);
        for (Integer num: numbers) {
            if (num % 2 == 0){
                even.add(num);
            }
        }
        System.out.println(even);
    }

}
