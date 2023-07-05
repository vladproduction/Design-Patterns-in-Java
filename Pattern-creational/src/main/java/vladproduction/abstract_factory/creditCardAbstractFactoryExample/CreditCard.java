package vladproduction.abstract_factory.creditCardAbstractFactoryExample;

//abstract product
public abstract class CreditCard {

    protected int cardNumber;
    protected int cardCode;


    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCardCode() {
        return cardCode;
    }

    public void setCardCode(int cardCode) {
        this.cardCode = cardCode;
    }
}
