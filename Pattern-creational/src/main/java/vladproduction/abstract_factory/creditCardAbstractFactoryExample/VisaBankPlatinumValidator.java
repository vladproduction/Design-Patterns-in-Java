package vladproduction.abstract_factory.creditCardAbstractFactoryExample;

public class VisaBankPlatinumValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
