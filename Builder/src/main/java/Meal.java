import java.util.ArrayList;
import java.util.List;

public class Meal {

    List<Item> meal = new ArrayList<>();
    void addItem(Item item){
        meal.add(item);
    }

    float getCost(){
        float cost = 0.0f;
        for(Item i:meal){
            cost+=i.price();
        }
        return cost;
    }

    void printItem(){
        for(Item i:meal){
            System.out.printf("name:%1s,price:%2s \n",i.name(),i.price());
        }
    }
}
