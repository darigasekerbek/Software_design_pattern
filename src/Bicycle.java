public class Bicycle implements TransportStrategy {
    public void ride(){
        System.out.println("Person riding a bicycle");
    }
    public void stop(){
        System.out.println("Person braking the bicycle");
    }
    public void breakDown(){
        System.out.println("The bicycle has a flat tire");
    }
}
