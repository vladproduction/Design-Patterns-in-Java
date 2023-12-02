package com.vladproduction.pub_sub_practice.property_change_support;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Objects;

public class Student {

    private String name;
    private int age;

    //we can talk here about support as our publisher(sending message)
    private PropertyChangeSupport support = new PropertyChangeSupport(this);

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        support.firePropertyChange("name", this.name, name); //when changes happens, support will send
        //notification to all listeners that name was changed
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        support.firePropertyChange("age", this.age, age);
        this.age = age;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //as parameter, all subscribers who are implements from interface PropertyChangeListener
    public void addSubscriber(PropertyChangeListener subscriber) {
        support.addPropertyChangeListener(subscriber); //we can add our listener for messaging by support about Person
    }
}
