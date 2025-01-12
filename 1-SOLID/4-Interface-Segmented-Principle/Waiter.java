class Waiter implements RestaurantEmployeeInterface{

    @Override
    public void serveCustomers() {
        System.out.println("Serving customers...");
    }

   // these two are unnecessary cause waiter dont need to implement it
    @Override
    public void cookFood() {
        // No need to cook food in this case
    }

    @Override
    public void washDishes() {
        System.out.println("Washing dishes...");
    }

}


// Solution For this is segregate your intefaces in a way that 
// class do not need to implement unneccessary functionalities
// Create  WaiterInterface
// Create  ChefInterface and write implementation.