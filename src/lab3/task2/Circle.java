package lab3.task2;

public class Circle {
    private Point center;
    private double radius;

    public Circle(double x, double y, double r){
        center = new Point(x, y);
        radius = r;
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

    public String toString(){
        return "x: " + center.getX() + "; y: " + center.getY() + "; radius: " + getRadius();
    }
}
