package co.bibleit.abstractfactory;

public class Client {

    public static void main(String[] args) {

        // get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        // get object of Shape Circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        // call the draw method
        shape1.draw();

        // get colors
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        // get Red
        Color color1 = colorFactory.getColor("RED");
        // call fill
        color1.fill();
    }
}
