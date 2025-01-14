// Coffee with milk
class MilkCoffee extends Coffee {
    @Override
    public String getDescription() {
        return "Plain Coffee, Milk";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }
}

// Coffee with sugar
class SugarCoffee extends Coffee {
    @Override
    public String getDescription() {
        return "Plain Coffee, Sugar";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.2;
    }
}

// Coffee with milk + sugar
class MilkSugarCoffee extends Coffee {
    @Override
    public String getDescription() {
        return "Plain Coffee, Milk, Sugar";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5 + 0.2;
    }
}
