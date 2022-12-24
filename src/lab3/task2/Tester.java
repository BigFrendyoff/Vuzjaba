package lab3.task2;

import java.util.ArrayList;
import java.util.Comparator;

public class Tester {
    private ArrayList<Circle> circles;
    private int n;

    public Tester(ArrayList<Circle> circles) {
        this.circles = circles;
        n = circles.size();
    }

    public Circle smallestCircle(){
        Comparator<Circle> comparator = Comparator.comparing(Circle::getRadius);
        return circles.stream().min(comparator).get();
    }

    public Circle biggestCircle(){
        Comparator<Circle> comparator = Comparator.comparing(Circle::getRadius);
        return circles.stream().max(comparator).get();
    }

    public void sort(){
        Comparator<Circle> comparator = Comparator.comparing(Circle::getRadius);
        circles.sort(comparator);
    }

    public ArrayList<Circle> getCircles() {
        return circles;
    }

    public void addElement(Circle circle){
        circles.add(circle);
    }
}
