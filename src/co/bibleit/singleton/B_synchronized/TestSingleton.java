package co.bibleit.singleton.B_synchronized;

public class TestSingleton {
    /**
     This example is Thread Safe
     You make the global access method synchronized.

     By adding synchrozined to the getInstance we force every thread to wait its turn.

     PROBLEMS WITH THIS APPROACH
     1. It can have a severe bottleneck.
        All the threads have to wait for the check, this could reduce the performance.

     */
    public static void main(String[] args) {

        Singleton s = Singleton.getInstance();

        s.setData(55);
        System.out.println("First reference: " + s);
        System.out.println("Singleton data value is: " + s.getData());

        s = null;
        s = Singleton.getInstance();

        System.out.println("First reference: " + s);
        System.out.println("Singleton data value is: " + s.getData());
    }
}
