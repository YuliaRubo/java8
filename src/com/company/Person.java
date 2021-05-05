package com.company;

public class Person{

    private   String firsName;
    private  String lastName;
    public Address address;



    Person(String firsName, String lastname, Address address) {
        this.address=address;
        this.firsName=firsName;
        this.lastName=lastname;

    }
    public String getFirsName(){
       return firsName;
    }
    public String getLastName(){
        return lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName = " + firsName +
                ", LastName = " + lastName +
                ", address: " + address.getInfo()+
                '}'+"\n";
    }
}
