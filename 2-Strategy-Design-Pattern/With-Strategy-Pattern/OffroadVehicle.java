public class OffroadVehicle extends Vehicle{
    OffroadVehicle(){
        super(new SportDriveStrategy());
    }
}