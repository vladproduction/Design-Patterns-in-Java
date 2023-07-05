package vladproduction.abstract_factory.creditCardAbstractFactoryExample;

public class WorldBankFactory extends CreditCardFactory {
    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case PLATINUM:
                return new WorldBankPlatinumCard();
            case GOLD:
                return new WorldBankGoldCard();
            case SILVER:
                return new WorldBankSilverCard();
        }
        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType) {
            case PLATINUM:
                return new WorldBankPlatinumValidator();
            case GOLD:
                return new WorldBankGoldValidator();
            case SILVER:
                return new WorldBankSilverValidator();

        }
        return null;
    }
}
