package co.bibleit.fatoryconcretecreator;

public class ShapeFactory {

    // use the getShape() method to get an object of type shape.
    public Shape getShape(String shape){
        if (shape == null){
            return null;
        }
        else if (shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        else if (shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        else if (shape.equalsIgnoreCase("")){
            return new Square();
        }

        return null;
    }
}
