package co.bibleit;

interface DisplayModule {
    public void display();
}

class Monitor implements DisplayModule {

    @Override
    public void display() {
        System.out.println("Display through a Monitor");
    }
}


class Projector implements DisplayModule{

    @Override
    public void display() {
        System.out.println("Display through a projector");
    }
}

public class Computer {
    DisplayModule dm;

    public void setDisplayModule(DisplayModule dm){
        this.dm = dm;
    }

    public void display(){
        dm.display();
    }

    public static void main(String args[]){

        Computer cm = new Computer();
        DisplayModule dm = new Monitor();
        DisplayModule dm2 = new Projector();

        cm.setDisplayModule(dm);
        cm.display();
        cm.setDisplayModule(dm2);
        cm.display();
    }
}