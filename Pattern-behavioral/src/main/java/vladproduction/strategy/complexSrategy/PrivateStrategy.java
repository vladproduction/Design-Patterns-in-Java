package vladproduction.strategy.complexSrategy;

public class PrivateStrategy extends ValidationStrategy {
    @Override
    public boolean isValid(CreditCard creditCard) {
        boolean isValid = true;

        isValid = creditCard.getNumber().startsWith("44") ||
                creditCard.getNumber().startsWith("42");

        if(isValid){
            isValid = creditCard.getNumber().length()==16;
        }
        if(isValid){
            isValid = passesLuhn(creditCard.getNumber());
        }
        return isValid;
    }
}
