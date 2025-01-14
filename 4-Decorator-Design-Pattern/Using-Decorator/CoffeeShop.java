// 5. USAGE EXAMPLE
public class CoffeeShop {
    public static void main(String[] args) {

        // Start with a basic (plain) coffee
        Coffee myOrder = new PlainCoffee();

        // It is same as : myOrder = new SugarDecorator(new MilkDecorator(myOrder)))
        // Decorate with milk
        myOrder = new MilkDecorator(myOrder);

        // Decorate with sugar
        myOrder = new SugarDecorator(myOrder);

        // Print the final description and cost
        System.out.println("Order: " + myOrder.getDescription());
        System.out.println("Cost: $" + myOrder.getCost());
    }
}
