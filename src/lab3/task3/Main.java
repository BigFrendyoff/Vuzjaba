package lab3.task3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        Random random = new Random();
        for (int i = 0; i < 4; i++){
            numbers[i] = random.nextInt();
        }
        for (int number:numbers) {
            System.out.println(number);
        }
        if(numbers[0] < numbers[1] && numbers[1] < numbers[2] && numbers[2] < numbers[3]){
            System.out.println("Строго возрастает");
        }
        else {
            System.out.println("Не строго возрастает");
        }
    }
}
