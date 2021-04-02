package org.company;

/**
 * Hello world!
 *
 */
public class CommandDemo
{
    public static void main( String[] args )
    {
        Stock abcStock = new Stock();
        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takerOrder(buyStockOrder);
        broker.takerOrder(sellStockOrder);
        broker.placeOrders();

    }
}
