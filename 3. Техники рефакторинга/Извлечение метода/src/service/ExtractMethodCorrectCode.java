package service;

import domain.Person;

public class ExtractMethodCorrectCode {

    public void printOwing(Person person) {
        printBanner();
        printPersonDetails(person);
    }

    public void printBanner() {
        System.out.println("[TAYVISCON]");
    }

    public void printPersonDetails(Person person) {
        System.out.println("Фамилия: " + person.surname());
        System.out.println("Дата рождения: " + person.birthDate());
    }

}