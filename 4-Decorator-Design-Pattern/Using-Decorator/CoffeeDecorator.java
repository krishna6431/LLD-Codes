// 3. DECORATOR
// This is an abstract class that implements the Coffee interface.
// It acts as a "wrapper" for a Coffee object, allowing us to add new features later.
abstract class CoffeeDecorator implements Coffee {

    // We'll hold a reference to a Coffee object (the "thing" we are wrapping).
    protected Coffee coffee;

    // The constructor takes a Coffee object.
    // This is the object we are going to decorate.
    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        // By default, just return the wrapped coffee's description
        return coffee.getDescription();
    }

    @Override
    public double getCost() {
        // By default, just return the wrapped coffee's cost
        return coffee.getCost();
    }
}
