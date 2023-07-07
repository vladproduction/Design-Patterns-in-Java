package vladproduction.template.demo;

public class Person implements Comparable<Person>{

    private String name;
    private String phone;
    private int age;

    public Person(){

    }

    public Person(String name, String phone, int age) {
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public int compareTo(Person o) {
        if(this.age>o.age){
            return 1;
        }
        if(this.age<o.age){
            return -1;
        }
        return 0;
    }
}
