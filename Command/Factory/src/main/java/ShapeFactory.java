public class ShapeFactory {

    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }

        if(shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }else {
            return new Rectangle();
        }
    }
}
