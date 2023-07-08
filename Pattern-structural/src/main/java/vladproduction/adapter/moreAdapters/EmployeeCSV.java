package vladproduction.adapter.moreAdapters;

import java.util.StringTokenizer;

public class EmployeeCSV {

    private int numbercv;
    private String firstName;
    private String surname;
    private String emailAddress;
    public EmployeeCSV(String values) {
        StringTokenizer tokenizer = new StringTokenizer(values, ",");
        if (tokenizer.hasMoreElements()) {
            numbercv = Integer.parseInt(tokenizer.nextToken());
        }
        if (tokenizer.hasMoreElements()) {
            firstName = tokenizer.nextToken();
        }
        if (tokenizer.hasMoreElements()) {
            surname = tokenizer.nextToken();
        }
        if (tokenizer.hasMoreElements()) {
            emailAddress = tokenizer.nextToken();
        }
    }

    public int getNumbercv() {
        return numbercv;
    }

    public void setNumbercv(int numbercv) {
        this.numbercv = numbercv;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

}
