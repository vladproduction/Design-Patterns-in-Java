package vladproduction.strategy.complexSrategy;

public class TestLuhn {
    public static void main(String[] args) {
        Card card = new Card("4485063271776605");
        boolean isValidNumber = passesLuhn(card.getNumber());
        System.out.println(card.number+" isValidNumber = "+isValidNumber);

    }
    private static boolean passesLuhn(String ccNumber){
        int sum = 0;
        boolean alternate = false;
        for (int i = ccNumber.length()-1; i>=0;i--){
            int n = Integer.parseInt(ccNumber.substring(i, i+1));
            if(alternate){
                n *= 2;
                if(n>9){
                    n = (n % 10)+1;
                }
            }
            sum+=n;
            alternate = !alternate;
        }
        return (sum%10==0);
    }
    static class Card{

        private String number;

        public Card(String number){
            this.number = number;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        @Override
        public String toString() {
            return number;
        }
    }
}
