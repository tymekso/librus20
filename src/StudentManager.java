import java.time.LocalDate;

public record StudentManager(String name, String surname, LocalDate birthDate, String pesel, String country, StudentType type) { }
