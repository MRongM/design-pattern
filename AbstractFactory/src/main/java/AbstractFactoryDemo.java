public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory =  FactoryProducer.getFactory("shape");
        AbstractFactory colorFactory =  FactoryProducer.getFactory("color");
        Shape shape1 = shapeFactory.getShape("circle");
        Shape shape2 = shapeFactory.getShape("rectangle");
        Color color1 = colorFactory.getColor("red");
        Color color2 = colorFactory.getColor("green");
        shape1.draw();
        shape2.draw();
        color1.fill();
        color2.fill();
    }
}
