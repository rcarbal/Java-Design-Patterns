package co.bibleit.dependencyinjection;

public interface Service {
    void write(String message);
}

public class ServiceA implements Service {

    @Override
    public void write(String message){
        System.out.println("Hello World");
    }
}

public class Client {
    private Service myServie;

    // inject via constructor
    public Client (Service service){
        this.myServie = service;
    }

    public void doSomething(){
        myServie.write("This is a message");
    }

    // you can use setter method.
    public void serServiice(Service service){
        this.myServie = service;
    }

    public static void main(String[] args) {
        Service service = new ServiceA(); // the injector
        Client client = new Client(service); // this injects via construcor
        client.doSomething();

        // inject via setter method
        client.serServiice(service) ;
    }
}
