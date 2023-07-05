package vladproduction.factory.websiteFactoryExample;

public class Shop extends Website{
    @Override
    public void createWebsite() {
        pages.add(new ClientShopPage());
        pages.add(new BasketShopPage());
        pages.add(new PaymentShopPage());
        pages.add(new SearchShopPage());
    }
}
