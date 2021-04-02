package org.company;

public class Stock {
    private String name= "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock name"+name+"Quantity:"+quantity+"bought");
    }

    public void sell(){
//        System.out.println("Stock name"+name+"Quantity:"+quantity+"");
        System.out.printf("Stocme:%1$s Quantity:%2$s sold %n",name,quantity);
    }

}
