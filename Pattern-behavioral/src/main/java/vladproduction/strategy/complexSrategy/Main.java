package vladproduction.strategy.complexSrategy;

public class Main {
    public static void main(String[] args) {
        CreditCard privateCC = new CreditCard(new PrivateStrategy());
        privateCC.setNumber("4485063271776605");
        privateCC.setDate("01/2030");
        privateCC.setCvv("123");

        System.out.println(privateCC.getNumber()+" Is Private valid: "+privateCC.isValid());

        CreditCard privateCC2 = new CreditCard(new PrivateStrategy());
        privateCC2.setNumber("4485063271776665"); //false
        privateCC2.setDate("02/2030");
        privateCC2.setCvv("456");

        System.out.println(privateCC2.getNumber()+" Is Private valid: "+privateCC2.isValid());

        //5526589975466885-->new VisaStrategy
        CreditCard visaCC = new CreditCard(new VisaStrategy());
        visaCC.setNumber("5526589975466885"); //true
        visaCC.setDate("02/2030");
        visaCC.setCvv("456");

        System.out.println(visaCC.getNumber()+" Is Visa valid: "+visaCC.isValid());

    }
}
