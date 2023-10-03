public class Car implements TransportStrategy {
    public void ride() {
        System.out.println("Person driving a car");
    }
    public void stop() {
        System.out.println("Person stopping the car");
    }
    public void breakDown(){
        System.out.println("The car was in an accident");
    }
}
