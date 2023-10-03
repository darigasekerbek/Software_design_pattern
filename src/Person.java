public class Person {
    private static Person instance;
    private TransportStrategy transport;
    private Person(){
        System.out.println("You created person.");
    }
    public static synchronized Person getInstance(){ // Method for getting a single instance of a class
        if (instance == null){
            instance = new Person();
        }
        return instance;
    }
    public void setTransportStrategy(TransportStrategy str){ // Method for setting transport strategy
        this.transport = str;
    }
    public void rideTransport(){ // Method for using transport strategy
        if (transport != null){
            transport.ride();
        }
        else {
            System.out.println("No transport for driving.");
        }
    }
    public void stopTransport(){ // Method to stop transport strategy
        if (transport != null){
            transport.stop();
        }
        else {
            System.out.println("No transport to stop.");
        }
    }
}
