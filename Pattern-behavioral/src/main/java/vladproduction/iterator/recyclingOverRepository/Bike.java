package vladproduction.iterator.recyclingOverRepository;

public class Bike {
    private String name;

    public Bike(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {

        return "Bike["+ name + "]";
    }
}
