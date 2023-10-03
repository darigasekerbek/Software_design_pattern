public class Boat implements TransportStrategy {
    public void ride(){
        System.out.println("Person sailing a boat");
    }
    public void stop(){
        System.out.println("Person anchoring the boat");
    }
    public void breakDown(){
        System.out.println("The boat's engine failed!");
    }
}
