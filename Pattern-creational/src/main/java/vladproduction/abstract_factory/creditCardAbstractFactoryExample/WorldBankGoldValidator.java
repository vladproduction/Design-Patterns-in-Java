package vladproduction.abstract_factory.creditCardAbstractFactoryExample;

public class WorldBankGoldValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
