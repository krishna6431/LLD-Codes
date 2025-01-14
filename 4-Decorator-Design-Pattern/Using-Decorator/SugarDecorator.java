// 4.2 SUGAR DECORATOR
class SugarDecorator extends CoffeeDecorator {

    // When you create a SugarDecorator, pass in the coffee you want to wrap.
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        // Add ", Sugar" to the existing coffee description.
        return coffee.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        // Add $0.2 to the existing coffee cost.
        return coffee.getCost() + 0.2;
    }
}
