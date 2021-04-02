import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FactoryDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("square");
        Shape shape2 = shapeFactory.getShape("");
        shape1.draw();
        shape2.draw();
//        List<Integer> list=new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        //将数组进行累加求和
//        //由于返回的是 Optional ，因此需要get()取出值。
//        Integer total=list.stream().reduce((a,b)-> a+b).get();
//        System.out.println(total);
    }
}
