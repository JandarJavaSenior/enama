import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("vvedi na Amgliskom strogo pravelno!!!!: ");
        String inputDay = scanner.next();


        switch (dni.valueOf(inputDay)) {
            case MONDAY:
                System.out.println("Дуйшөмбү куну жава окуйм");
                break;
            case TUESDAY:
                System.out.println("Шейшемби күнү англис тили сабагын окуйм");
                break;
            case WEDNESDAY:
                System.out.println("Шаршемби күнү кыргыз тили сабагын окуйм");
                break;
            case THURSDAY:
                System.out.println("Бейшемби күнү рус тили сабагын окуйм");
                break;
            case FRIDAY:
                System.out.println("Жума күнү математика сабагын окуйм");
                break;
            case SATURDAY:
                System.out.println("Ишемби күнү физика сабагын окуйм");
                break;
            case SUNDAY:
                System.out.println("Жекшемби күнү биология сабагын окуйм");
                break;
            default:
                System.out.println("Күн табылган жок.");
                break;
        }
    }
}
