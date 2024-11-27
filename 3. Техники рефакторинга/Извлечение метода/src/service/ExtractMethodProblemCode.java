package service;

import domain.Person;

public class ExtractMethodProblemCode {

   public void printOwing(Person person) {
      printBanner();

      System.out.println("Фамилия: " + person.surname());
      System.out.println("Дата рождения: " + person.birthDate());
   }

   public void printBanner() {
      System.out.println("[TAYVISCON]");
   }


}