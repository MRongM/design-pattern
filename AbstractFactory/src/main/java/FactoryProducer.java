public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        if(type.equalsIgnoreCase("shape")){
            return new ShapeFactory();
        }
        return new ColorFactory();
    }
}
