public class Main {
    public static void main(String[] args) {
        Person person = Person.getInstance();

        person.setTransportStrategy(new Car()); //Person driving a car
        person.rideTransport();

        person.setTransportStrategy(new Boat()); //Person anchoring the boat
        person.stopTransport();

        person.setTransportStrategy(new Bicycle()); //Person braking the bicycle
        person.breakDownTransport();

    }
}