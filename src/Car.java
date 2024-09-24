public class Car extends Vehicle {
    @Override
    public void start(){
        System.out.println("start like a Car");
    }
    @Override
    public void stop(){
        System.out.println("stop like a Car");
    }
    @Override
    public void accelerate(){
        System.out.println("0 - 100 in 10 sec");
    }
}