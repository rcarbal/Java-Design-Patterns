package co.bibleit.singleton.C_double_check_block;

public class Singleton {
    /**
     This is the recommended
     */

    // 1. private reference to the one and only instance

    // 6. add volatile keyword to the instance, this is used with synchronized keyword.
    // it makes the data synchronized through all threads
    private volatile static Singleton uniqueInstance = null;

    // 2. an instance attribute
    private int data = 0;

    // 3. Make constructor private
    private Singleton() {}

    // 4. create the get instance method
    // 5. Add synchronized to getInstance to make it thread safe

    // 7. Remove synchronized from the declaration and add it inside
    public static Singleton getInstance(){
        if (uniqueInstance == null) {
            synchronized (Singleton.class){ // we only synchronize the first time through
                if (uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
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
