
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the School Personnel Information System");
        System.out.println("*****************************************");
        System.out.println("Please select the unit whose information you want to view:\n"
                            + "1- Student\n"
                            + "2- Teacher\n"
                            + "3- Principal\n"
                            + "4- Exit the System");

        String unit = scanner.nextLine();

        while (!"4".equals(unit)) {

            if ("1".equals(unit)) {
                Student Aiden = new Student("Aiden", 19, "Math", "12/A", 95);
                Aiden.show_Info();
            } else if ("2".equals(unit)) {
                Teacher Anna = new Teacher("Anna", 41, "Biology");
                Anna.show_Info();
            } else if ("3".equals(unit)) {
                Principal John = new Principal("John", 52, "English");
                John.show_Info();
            } else {
                System.out.println("Invalid Input");
            }

            System.out.println("Please select the unit whose information you want to view:\n"
                                + "1- Student\n"
                                + "2- Teacher\n"
                                + "3- Principal\n"
                                + "4- Exit the System");

            unit = scanner.nextLine();
        }

        System.out.println("Exiting the system...");
    }
}



