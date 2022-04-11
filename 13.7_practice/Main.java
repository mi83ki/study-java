public class Main {
    public static void main(String[] args) {
        Y[] buf = new Y[2];
        buf[0] = new A();
        buf[1] = new B();
        for (Y y : buf) {
            y.b();
        }
    }
}
