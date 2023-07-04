package vladproduction.builder.exposedSetters;

public class LunchOrder {

    private String firstMeal;
    private String secondMeal;
    private String bread;
    private String drink;

    public LunchOrder(){

    }

    public String getFirstMeal() {
        return firstMeal;
    }

    public String getSecondMeal() {
        return secondMeal;
    }

    public String getBread() {
        return bread;
    }

    public String getDrink() {
        return drink;
    }

    public void setFirstMeal(String firstMeal) {
        this.firstMeal = firstMeal;
    }

    public void setSecondMeal(String secondMeal) {
        this.secondMeal = secondMeal;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}
