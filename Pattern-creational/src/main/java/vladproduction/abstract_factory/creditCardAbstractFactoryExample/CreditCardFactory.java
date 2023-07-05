package vladproduction.abstract_factory.creditCardAbstractFactoryExample;

public abstract class CreditCardFactory {

    public static CreditCardFactory getCreditCardFactory(int cardScore){

        if(cardScore>650){
            return new WorldBankFactory();
        }
        else{
            return new VisaBankFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);
}
