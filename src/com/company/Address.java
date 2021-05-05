package com.company;

public class Address {

    public String city;
   public String street;
   public int number;



    public Address(String city, String street, int number ){
        this.city=city;
        this.street=street;
        this.number=number;
    }






    public void getCity(){
        System.out.println("город:" + city);
    }
    public void getStreet(){
        System.out.println("улица:" + street);
    }


    public String getInfo(){
        return "г. " + city + ", улица " + street + ", номер дома " + number;
    }


    public  int getNumber() {
        return number;
    }
}

