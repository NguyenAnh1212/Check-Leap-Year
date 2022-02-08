import java.util.Scanner;

public class CheckLeapyear {
    public static void main(String[] args) {
        System.out.println("Given year is leap year or not?");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean check = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    check = true;
                }
            } else {
                check = true;
            }
        }

        if (check) {
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }
}

