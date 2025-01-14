// 2. CONCRETE COMPONENT
// This is our basic coffee (plain black coffee).
class PlainCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Plain Coffee";
    }

    @Override
    public double getCost() {
        return 2.0; // Basic cost
    }
}
