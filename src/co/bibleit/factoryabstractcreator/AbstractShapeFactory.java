package co.bibleit.factoryabstractcreator;

// This is the most strict implementation of the factory method
// Create a subclass that implements every single factory method.

public abstract class AbstractShapeFactory {

    protected abstract Shape factoryMethod();

    public Shape getShape() {
        return factoryMethod();
    }
}

class RectangleFactory extends AbstractShapeFactory {
    protected Shape factoryMethod(){
        return new Rectangle();
    }
}

class CircleFactory extends AbstractShapeFactory {
    protected Shape factoryMethod(){
        return new Circle();
    }
}

class SquareFactory extends AbstractShapeFactory {
    protected Shape factoryMethod(){
        return new Square();
    }
}