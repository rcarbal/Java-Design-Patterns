package co.bibleit.singleton.B_synchronized;

public class Singleton {

    // 1. private reference to the one and only instance
    private static Singleton uniqueInstance = null;

    // 2. an instance attribute
    private int data = 0;

    // 3. Make constructor private
    private Singleton() {}

    // 4. create the get instance method
    // 5. Add synchronized to getInstance to make it thread safe
    public static synchronized Singleton getInstance(){
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
