package co.bibleit.singleton.D_bill_pugh;

public class Singleton {

    /**
     This is the recommended approach

     The instance is created in the nested inner class.
     When the Singleton class is loaded, the helper class is not loaded into memory.
     Only when someone calls the getInstance() then this class will then get loaded
     */


    // 2. an instance attribute
    private int data = 0;

    // 3. Make constructor private
    private Singleton() {}

    // 1. Do not put the member variable on top, use a nested inner class
    // private static Singleton uniqueInstance = null;

    private static class SingletonHelper {
        // Nested class it is referenced after the getInstance() is called.
        private static final Singleton uniqueInstance = new Singleton();

    }

    // 4. create the get instance method
    public static Singleton getInstance(){

        return SingletonHelper.uniqueInstance;
    }

    public void setData(int myDate){
        data = myDate;
    }
    public int getData(){
        return data;
    }
}
