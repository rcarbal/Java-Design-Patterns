package co.bibleit.singleton.D_bill_pugh;

public class TestSingleton {
    public static void main(String[] args) {

        // 5. Create the new instance of the singelton
        Singleton s = Singleton.getInstance();

        s.setData(55);
        System.out.println("First reference: " + s);
        System.out.println("Singleton data value is: " + s.getData());

        // 6. get another reference to the Singleton
        s = null;
        s = Singleton.getInstance();

        System.out.println("First reference: " + s);
        System.out.println("Singleton data value is: " + s.getData());
    }
}
