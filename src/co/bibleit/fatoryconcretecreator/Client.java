package co.bibleit.fatoryconcretecreator;

public class Client {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        // get different objects
        Shape shape1 = factory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = factory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = factory.getShape("SQUARE");
        shape3.draw();
    }
}
