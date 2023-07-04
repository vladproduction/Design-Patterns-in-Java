package vladproduction.builder.innerClassAction;

public class Sandwich {
    private final String bread;
    private final String meat;
    private final String cheese;
    private final String dressing;

    public Sandwich(BuilderInner builder) {
        this.bread = builder.bread;
        this.meat = builder.meat;
        this.cheese = builder.cheese;
        this.dressing = builder.dressing;
    }

    public static class BuilderInner {
        private  String bread;
        private  String meat;
        private  String cheese;
        private  String dressing;

        public BuilderInner() {

        }
        public Sandwich sandwichCreator(){
            System.out.println("Your very best sandwich include:");
            return new Sandwich(this);
        }
        public BuilderInner bread(String bread){
            this.bread = bread;
            return this;
        }
        public BuilderInner meat(String meat){
            this.meat = meat;
            return this;
        }
        public BuilderInner cheese(String cheese){
            this.cheese = cheese;
            return this;
        }
        public BuilderInner dressing(String dressing){
            this.dressing = dressing;
            return this;
        }
    }

    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public String getCheese() {
        return cheese;
    }

    public String getDressing() {
        return dressing;
    }
}
