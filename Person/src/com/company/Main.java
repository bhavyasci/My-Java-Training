package com.company;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);

        System.out.println("fullname is : "+person.getFullName());
        System.out.println("Teen= "+person.isTeen());
    }
}
