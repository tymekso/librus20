import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<StudentManager> studentManagers = new ArrayList<>();
    public static void main(String[] args) {
        mainMenu();
    }

    private static void mainMenu() {
        while (true) {
            System.out.println("""
                Witaj w systemie aguga++
                
                1 - Dodaj ucznia
                2 - Zarządzaj uczniami
                3 - Show uczn
                """);

            Scanner scn = new Scanner(System.in);
            if (scn.hasNextInt()) {
                var option = scn.nextInt();
                if (option == 1) {
                    addStudent(scn);
                }
                else if (option == 2) {
                    manageStudent(scn);
                }
                else if (option == 3) {
                    showStudents();
                }
                else {
                    break;
                }
            }
        }
    }

    private static void addStudent(Scanner scn) {
        System.out.println("aguga | Dodać ucznia");

        System.out.println("Imie");
        String name = scn.next();
        System.out.println("Nazwisko");
        String surname = scn.next();
        System.out.println("Data | rok");
        int birthYear = scn.nextInt();
        System.out.println("Data | miesiąc");
        int birthMonth = scn.nextInt();
        System.out.println("Data | dzień");
        int birthDay = scn.nextInt();
        LocalDate date = LocalDate.of(birthYear, birthMonth, birthDay);
        System.out.println("Pesel");
        String pesel = scn.next();
        System.out.println("Kraj");
        String country = scn.next();
        System.out.println("Typ");
        StudentType type = StudentType.valueOf(scn.next());

        StudentManager sm = new StudentManager(name, surname, date, pesel, country, type);
        System.out.println("Uczeń dodany");
        studentManagers.add(sm);
    }

    private static void showStudents() {
        studentManagers.forEach(System.out :: println);
    }
    private static void manageStudent(Scanner scn) {
        System.out.println("aguga | Zarządzać uczniem");
    }


}