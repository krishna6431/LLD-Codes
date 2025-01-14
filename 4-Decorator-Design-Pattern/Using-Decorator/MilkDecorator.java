// 4.1 MILK DECORATOR
class MilkDecorator extends CoffeeDecorator {

    // When you create a MilkDecorator, pass in the coffee you want to wrap.
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        // Add ", Milk" to the existing coffee description.
        return coffee.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        // Add $0.5 to the existing coffee cost.
        return coffee.getCost() + 0.5;
    }
}
