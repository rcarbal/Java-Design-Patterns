package co.bibleit.factorystaticmethod;

public class Client {

    public static void main(String[] args) {
        // get an object using the static method
        Shape shape1 = ShapeFactory.getShape("Circle");
        shape1.draw();

        // pass in "RECTANGLE" "SQUARE"
    }
}
