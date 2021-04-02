package org.company;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orderList = new ArrayList<>();
    public void takerOrder(Order order){
        orderList.add(order);
    }
    public void placeOrders(){
        for(Order order:orderList){
            order.execute();
        }
        orderList.clear();
    }

}
