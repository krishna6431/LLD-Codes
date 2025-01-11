class MoterCycle implements Bike{
    boolean isEngineeOn;
    int speed;

    public void turnOnEngine(){
        isEngineOn = true;
    }

    public void accelerate(){
        speed += 10;
    }
}