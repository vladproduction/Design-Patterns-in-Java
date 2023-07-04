package vladproduction.builder.telescopingConstructors;

public class LunchOrder {
    private String firstMeal;
    private String secondMeal;
    private String bread;
    private String drink;

    public LunchOrder(String firstMeal) {
        this.firstMeal = firstMeal;
    }
    public LunchOrder(String firstMeal, String secondMeal) {
        this.firstMeal = firstMeal;
        this.secondMeal = secondMeal;
    }
    public LunchOrder(String firstMeal, String secondMeal, String bread) {
        this.firstMeal = firstMeal;
        this.secondMeal = secondMeal;
        this.bread = bread;
    }
    public LunchOrder(String firstMeal, String secondMeal, String bread, String drink) {
        this.firstMeal = firstMeal;
        this.secondMeal = secondMeal;
        this.bread = bread;
        this.drink = drink;
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

}
