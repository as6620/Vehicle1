public class Bicycle extends Vehicle{
    @Override
    public void start(){
        System.out.println("start like a Bicycle");
    }
    @Override
    public void stop(){
        System.out.println("stop like a Bicycle");
    }
    @Override
    public void accelerate(){
        System.out.println("0 - 15 per person");
    }
}