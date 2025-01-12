public class Main{
    public static void main(String[] args) {
        Vehicle vehicle = new PassangerVehicle();
        vehicle.drive();
        Vehicle vehicle2 = new OffroadVehicle();
        vehicle2.drive();  // Sport drive capability is used for offroad vehicle
        Vehicle vehicle3 = new SportVehicle();
        vehicle3.drive();  // Sport drive capability is used for sport vehicle
    }
}