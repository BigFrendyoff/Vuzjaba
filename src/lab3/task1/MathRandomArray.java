package lab3.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class MathRandomArray {
    public static void main(String[] args) {
        Random random = new Random();
        double[] doubles = new double[random.nextInt(5, 300)];
        for (int i = 0; i < doubles.length; i++){
            doubles[i] = Math.random();
        }

        for (double d:doubles) {
            System.out.println(d);
        }

        System.out.println("-".repeat(50));

        Arrays.sort(doubles);

        for (double d:doubles) {
            System.out.println(d);
        }
    }
}
