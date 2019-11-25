package co.bibleit.singleton.A_lazy;

public class TestSingleton {

    /**
     This is lazy implementation because we are not instantiating it until we need to use it.

     PROBLEMS with this approach
     1. It is not thread safe
        - if two calls are made at the same time, the first checks if the instance exists, if not it created it.
          but before that is done a second thread can come in and because the first instance isn't done the Singleton
          is still equal to null, so now you will get two instances of the Singleton.


        It may not be a problem if the Singleton is completely statteless, no member variable.

     It could be very difficult to find these problems.
     * **/

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
