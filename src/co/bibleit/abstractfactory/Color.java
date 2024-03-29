package co.bibleit.abstractfactory;

public interface Color {

    void fill();
}


class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill()");
    }
}

class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill()");
    }
}

class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill()");
    }
}