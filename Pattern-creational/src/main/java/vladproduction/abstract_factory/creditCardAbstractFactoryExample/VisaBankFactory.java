package vladproduction.abstract_factory.creditCardAbstractFactoryExample;

public class VisaBankFactory extends CreditCardFactory {
    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType){
            case PLATINUM :
                return new VisaBankPlatinumCard();
            case GOLD:
                return new VisaBankGoldCard();
            case SILVER:
                return new VisaBankSilverCard();
        }
        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType){
            case PLATINUM :
                return new VisaBankPlatinumValidator();
            case GOLD:
                return new VisaBankGoldValidator();
            case SILVER:
                return new VisaBankSilverValidator();
        }
        return null;
    }
}
