package co.bibleit.facoryMethodChallenge;

interface AnimalInterface {

    void eat();
}

class Tiger implements AnimalInterface {

    @Override
    public void eat() {
        System.out.println("The tiger is eating a dear");
    }
}

class Duck implements AnimalInterface {

    @Override
    public void eat() {
        System.out.println("The duck is eating lake guk");
    }
}


