package co.bibleit.facoryMethodChallenge;

interface Animal {

    void eat();
}

class Tiger implements Animal{

    @Override
    public void eat() {
        System.out.println("The tiger is eating a dear");
    }
}

class Duck implements Animal {

    @Override
    public void eat() {
        System.out.println("The duck is eating lake guk");
    }
}


