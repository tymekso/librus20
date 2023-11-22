import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        mainMenu();
    }

    private static void mainMenu() {
        while (true) {
            System.out.println("""
                Witaj w systemie aguga++
                
                1 - Dodaj ucznia
                2 - Zarządzaj uczniami
                """);

            Scanner scn = new Scanner(System.in);
            if (scn.hasNextInt()) {
                if (scn.nextInt() == 1) {
                    addStudent();
                    break;
                }
                else if (scn.nextInt() == 2) {
                    manageStudent();
                    break;
                }
            }
        }
    }

    private static void addStudent() {
        System.out.println("aguga | Dodać ucznia");
    }

    private static void manageStudent() {
        System.out.println("aguga | Zarządzać uczniem");
    }
}