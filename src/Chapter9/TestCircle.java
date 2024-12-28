package Chapter9;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("the area of the circle of radius "+c1.radius+" is "+c1.getArea());

        Circle c2 = new Circle(25);
        System.out.println("the area of the circle of radius "+c2.radius+" is "+c2.getArea());

        Circle c3 = new Circle(125);
        System.out.println("the area of the circle of radius "+c3.radius+" is "+c3.getArea());

        c2.radius = 100;
        System.out.println("the area of the circle of radius "+c2.radius+" is "+c2.getArea());
    }
}
class Circle{
    double radius;

    Circle(){
        radius = 1;
    }

    Circle(double r){
        radius = r;
    }

    double getArea(){
        return radius*radius*Math.PI;
    }

    double getPerimeter(){
        return 2*radius*Math.PI;
    }

    void setRadius(double newRadius){
        radius = newRadius;
    }

}
