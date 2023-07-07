package vladproduction.strategy.complexSrategy;

public class VisaStrategy extends ValidationStrategy {
    @Override
    public boolean isValid(CreditCard creditCard) {
        boolean isValid = true;

        isValid = creditCard.getNumber().startsWith("55") ||
                creditCard.getNumber().startsWith("54");

        if(isValid){
            isValid = creditCard.getNumber().length()==16;
        }
        if(isValid){
            isValid = passesLuhn(creditCard.getNumber());
        }
        return isValid;
    }
}
