package lab3.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Circle> circles = new ArrayList<>();
        for (int i = 0; i < 15; i++){
            circles.add(new Circle(Math.random(), Math.random(), Math.random()));
        }
        Tester tester = new Tester(circles);
        for (Circle circle:tester.getCircles()) {
            System.out.println(circle.toString());
        }
        System.out.println("-".repeat(50));
        System.out.println("Smallest: " + tester.smallestCircle());
        System.out.println("Biggest: " + tester.biggestCircle());
        System.out.println("-".repeat(50));
        tester.sort();
        for (Circle circle:tester.getCircles()) {
            System.out.println(circle.toString());
        }
    }
}
