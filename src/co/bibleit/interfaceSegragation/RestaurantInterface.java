package co.bibleit.interfaceSegragation;

public interface RestaurantInterface {
    public void acceptOnlineOrder();
    public void takeTelephoneOrder();
    public void payOnline();
    public void walkinCustomerOrder();
    public void payInPerson();
}

class OnlineClientImpl implements RestaurantInterface {
    @Override
    public void acceptOnlineOrder() {

    }

    @Override
    public void takeTelephoneOrder() {

    }

    @Override
    public void payOnline() {

    }

    @Override
    public void walkinCustomerOrder() {

    }

    @Override
    public void payInPerson() {

    }
}