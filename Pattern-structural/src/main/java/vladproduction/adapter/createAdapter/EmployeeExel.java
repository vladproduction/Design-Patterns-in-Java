package vladproduction.adapter.createAdapter;

public class EmployeeExel {

    private String id;
    private String lastName;
    private String name;
    private String mail;

    public EmployeeExel(String id, String lastName, String name, String mail) {
        this.id = id;
        this.lastName = lastName;
        this.name = name;
        this.mail = mail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
