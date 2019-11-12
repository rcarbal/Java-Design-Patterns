package co.bibleit.interfaceSegragation;

public interface RestaurantInterface {
    public void acceptOnlineOrder();
    public void takeTelephoneOrder();
    public void payOnline();
    public void walkinCustomerOrder();
    public void payInPerson();
}

public class OnlineClientImpl implements RestaurantInterface {}