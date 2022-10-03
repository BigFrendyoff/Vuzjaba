package lab2.task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Circle> circles = new ArrayList<>();
        int circlesCount;

        Scanner in = new Scanner(System.in);

        circlesCount = in.nextInt();

        for (int i = 0; i < circlesCount; i++){
            circles.add(new Circle(new Point(i / 1.5, i / 2.0), i + 0.5));
        }
        for (int i = 0; i < circlesCount; i++){
            System.out.println(circles.get(i).toString());
        }
        System.out.println("-".repeat(50));
        for (int i = 0; i < circlesCount; i++){
            circles.get(i).moveCenter(new Point(i + 1, i + 1));
            System.out.println(circles.get(i).toString());
        }

    }


}
