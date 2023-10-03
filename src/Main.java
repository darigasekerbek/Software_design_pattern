public class Main {
    public static void main(String[] args) {
        Person person = Person.getInstance();

        person.setTransportStrategy(new Car()); //Person driving a car
        person.rideTransport();

        person.setTransportStrategy(new Boat()); //Person driving a boat
        person.rideTransport();

        person.setTransportStrategy(new Bicycle()); //Person riding a bicycle
        person.rideTransport();

    }
}