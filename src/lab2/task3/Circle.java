package lab2.task3;

public class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void moveCenter(Point newPoint){
        center = newPoint;
    }

    public String toString(){
        return "X: " + center.getX() + "; Y: " + center.getY() + "; Radius: " + radius;
    }

}
