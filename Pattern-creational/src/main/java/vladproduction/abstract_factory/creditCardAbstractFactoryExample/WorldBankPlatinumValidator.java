package vladproduction.abstract_factory.creditCardAbstractFactoryExample;

public class WorldBankPlatinumValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
