package co.bibleit.singleton.A_lazy;

public class Singleton {

    // 1. private reference to the one and only instance
    private static  Singleton uniqueInstance = null;

    // 2. an instance attribute
    private int data = 0;

    // 3. Make constructor private
    private Singleton() {}

    // 4. create the get instance method
    public static Singleton getInstance(){
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }

        return uniqueInstance;
    }

    public void setData(int myDate){
        data = myDate;
    }
    public int getData(){
        return data;
    }
}
