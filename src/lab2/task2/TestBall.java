package lab2.task2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(2, 3);
        System.out.println(ball.getX() + " " + ball.getY());
        ball.setX(8);
        ball.setY(9);
        System.out.println(ball.getX() + " " + ball.getY());
        ball.setXY(13, 14);
        System.out.println(ball.getX() + " " + ball.getY());
        ball.move(7, -4);
        System.out.println(ball.toString());
    }
}
