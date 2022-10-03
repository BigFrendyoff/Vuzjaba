package lab2.task6;

public class TestCircle {
    public static void main(String[] args) {
        Circle circleOne = new Circle(3, 4, 5);
        Circle circleTwo = new Circle(2, 4, 2);
        Circle circleThree = new Circle(0, 0, 2);
        System.out.println(circleOne.calculatePerimeter());
        System.out.println(circleTwo.calculateSquare());
        if (circleOne.equals(circleTwo)){
            System.out.println("Равны!");
        }
        else{
            System.out.println("Не равны!");
        }
        if (circleTwo.equals(circleThree)){
            System.out.println("Равны!");
        }
        else{
            System.out.println("Не равны!");
        }
    }
}
