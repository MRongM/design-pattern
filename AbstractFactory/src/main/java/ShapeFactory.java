public class ShapeFactory extends AbstractFactory{
    public Shape getShape(String shapeType){
        if (shapeType.equalsIgnoreCase("circle")){
            return new Circle();
        }else {
            return new Rectangle();
        }
    }

    @Override
    public Color getColor(String type) {
        return null;
    }
}
