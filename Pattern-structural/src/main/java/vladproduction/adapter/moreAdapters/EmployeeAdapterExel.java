package vladproduction.adapter.moreAdapters;

public class EmployeeAdapterExel implements Employee {

    private EmployeeExel instance;
    public EmployeeAdapterExel(EmployeeExel instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getId();
    }

    @Override
    public String getFirstName() {
        return instance.getName();
    }

    @Override
    public String getLastName() {
        return instance.getLastName();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }

    public String toString(){
        return instance.getId() + ", " + instance.getName() + ", " +
        instance.getLastName() + ", " + instance.getMail();
    }

}
