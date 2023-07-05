package vladproduction.abstract_factory.creditCardAbstractFactoryExample;

public class VisaBankGoldValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
