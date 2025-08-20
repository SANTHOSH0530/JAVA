interface Flyable {
    void fly_obj();
}
class spacecraft implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("spacecraft is flying");
    }
}
class Airoplane implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Airoplane is flying");
    }
}
class Helicopter implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("helicopter is flying");
    }
}
public class santhosh1 {
    public static void main(String[] args) {
        Flyable[] f1 = {new spacecraft(), new Airoplane(), new Helicopter()};
        for (Flyable obj : f1) {
            obj.fly_obj();
        }
    }
}
