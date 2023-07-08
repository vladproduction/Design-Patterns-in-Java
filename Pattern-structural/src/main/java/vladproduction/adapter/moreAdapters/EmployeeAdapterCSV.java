package vladproduction.adapter.moreAdapters;

public class EmployeeAdapterCSV implements Employee {

    private EmployeeCSV instance;
    public EmployeeAdapterCSV(EmployeeCSV instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getNumbercv()+"";
    }

    @Override
    public String getFirstName() {
        return instance.getFirstName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getEmailAddress();
    }

    public String toString(){
        return instance.getNumbercv() + ", " + instance.getFirstName() + ", " +
                instance.getSurname() + ", " + instance.getEmailAddress();
    }
}
