import java.util.Scanner;

public class dayOfMonth {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter year:");
        int year = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Enter month:");
        String month = keyboard.nextLine();
        int day = switch (month) {
            case "Jannuary", "March", "May", "July", "August", "October", "December" -> 31;
            case "February" -> year % 4 == 0 ? 29 : 28;
            case "April", "Jun", "September", "November" -> 30;
            default -> 0;
        };
        System.out.println("Day of " + month + " in the " + year + " is " + day);
    }
}
