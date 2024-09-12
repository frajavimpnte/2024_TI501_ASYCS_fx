package u1.signal;

public class SignalTest {
    public static void main(String ... args) {
        Signal s1 = new Signal();
        Signal s2 = new Signal(0.1f, 1000.0f, 0.0f); 
        
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}