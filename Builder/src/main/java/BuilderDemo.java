public class BuilderDemo {
    static Meal getMeal(String s){
        Meal meal = new Meal();

        if(s.equals("1")){
          meal.addItem(new Coffee());
            meal.addItem(new VarBurger());
        }else{
            meal.addItem(new Cola());
            meal.addItem(new NoVarBurger());
        }

        return meal;
    }
    public static void main(String[] args) {
        Meal m1 = getMeal("1");
        Meal m2 = getMeal("2");
        System.out.println(m1.getCost());
        m1.printItem();
        System.out.println(m2.getCost());
        m2.printItem();
    }
}
