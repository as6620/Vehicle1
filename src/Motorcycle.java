public class Motorcycle extends Vehicle{
    @Override
    public void start(){
        System.out.println("start like a Motorcycle");
    }
    @Override
    public void stop(){
        System.out.println("stop like a Motorcycle");
    }
    @Override
    public void accelerate(){
        System.out.println("0 - 100 in 8 sec");
    }
}