public class CoffeeShopNaive {
    public static void main(String[] args) {
        Coffee coffee1 = new SugarCoffee();
        System.out.println(coffee1.getDescription());
        System.out.println("Cost: $" + coffee1.getCost());

        Coffee coffee2 = new MilkSugarCoffee();
        System.out.println(coffee2.getDescription());
        System.out.println("Cost: $" + coffee2.getCost());
    }
}