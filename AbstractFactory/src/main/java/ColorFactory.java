public class ColorFactory extends AbstractFactory{
    @Override
    public Shape getShape(String type) {
        return null;
    }

    public Color getColor(String colorType){
        if(colorType.equalsIgnoreCase("red")){
            return new Red();
        }
        return new Green();
    }
}
