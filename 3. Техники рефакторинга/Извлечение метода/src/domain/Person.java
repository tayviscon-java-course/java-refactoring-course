package domain;

import java.time.LocalDate;

public record Person(
    String surname,
    String name,
    String patronymic,
    LocalDate birthDate
) {

}
