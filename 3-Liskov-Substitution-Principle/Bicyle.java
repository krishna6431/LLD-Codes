class Bicyle implements Bike{

    //this is breaking the functionality
    public void startEngine(){
       throw new AssertionError("there is no engine");
    }

    public void accelerate(){
        // do acceleration
    }
}