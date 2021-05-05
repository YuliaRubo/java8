package com.company;

import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
       Person a1 = new Person("Лола", "Миш", new Address("Витебск", "Востер", 5));
        Person a2 = new Person("Рики", "Тики", new Address("Витебск", "Лазо", 6));
        Person a3 = new Person("Лали", "Куц", new Address("Витебск", "Правды", 9));
        Person a4 = new Person(null, "Тит", new Address("Витебск", "Ленина", 2));
        Person a5 = new Person("Мики", null, new Address("Витебск", "Строй", 6));
        Person a6 = new Person("Ники", "Тикток",null);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(a1);
        persons.add(a2);
        persons.add(a3);
        persons.add(a4);
        persons.add(a5);
        persons.add(a6);

      persons.stream()
                .filter(x -> x.getFirsName() != null  && x.getLastName()!=null && x.address!= null)
                .forEach(System.out::println);


   persons.stream()
               .filter(x -> x.address!=null)
               .sorted((o1, o2) -> o1.address.getNumber() - o2.address.getNumber())
               .collect(Collectors.toList())
               .forEach(System.out::print);
        System.out.println();

persons.stream()
        .filter(x -> x.getFirsName() != null  && x.getLastName()!=null && x.address!= null)
        .map(item->item.toString())
        .forEach(System.out::print);

    }
}
