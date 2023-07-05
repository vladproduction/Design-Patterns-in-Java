package vladproduction.abstract_factory.creditCardAbstractFactoryExample;

public class AbstractFactoryDemo {
    public static void main(String[] args) {

        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(800);
        CreditCard card01 = abstractFactory.getCreditCard(CardType.PLATINUM);
        System.out.println("card01:\n"+card01.getClass().getName());

        abstractFactory = CreditCardFactory.getCreditCardFactory(600);
        CreditCard card02 = abstractFactory.getCreditCard(CardType.GOLD);
        System.out.println("card02:\n"+card02.getClass().getName());

    }
}
