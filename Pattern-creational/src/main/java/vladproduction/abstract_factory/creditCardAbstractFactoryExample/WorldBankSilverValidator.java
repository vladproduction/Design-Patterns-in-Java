package vladproduction.abstract_factory.creditCardAbstractFactoryExample;

public class WorldBankSilverValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
