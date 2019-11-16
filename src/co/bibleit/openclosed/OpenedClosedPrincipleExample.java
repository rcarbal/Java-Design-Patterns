package co.bibleit.openclosed;

public class OpenedClosedPrincipleExample {
}

class Rectangle implements Shape{
    public double length;
    public double width;


    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Circle implements Shape{
    public double radius;

    @Override
    public double calculateArea() {
        return (22/7) * radius * radius;
    }
}


class AreaCalculator {
    public double calculateShapeArea(Shape shape){
        return shape.calculateArea();
    }
}

