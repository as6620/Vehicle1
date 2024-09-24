public class ElectricCar extends Vehicle{
    @Override
    public void start(){
        System.out.println("start like a ElectricCar");
    }
    @Override
    public void stop(){
        System.out.println("stop like a ElectricCar");
    }
    @Override
    public void accelerate(){
        System.out.println("0 - 100 in 6 sec");
    }
}