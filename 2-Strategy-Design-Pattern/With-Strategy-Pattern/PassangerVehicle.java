public class PassangerVehicle extends Vehicle{
    PassangerVehicle(){
        super(new NormalDriveStrategy());
    }
}