package vladproduction.abstract_factory.creditCardAbstractFactoryExample;

public class VisaBankSilverValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
