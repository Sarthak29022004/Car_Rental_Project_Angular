import java.util.Scanner;
public class switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day;
        System.out.print("Enter a no. between 1-7 :");
        day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("It's Sunday");
                break;
            case 2:
                System.out.println("It's Monday");
                break;
            case 3:
                System.out.println("It's Tuesday");
                break;
            case 4:
                System.out.println("It's Wednesday");
                break;
            case 5:
                System.out.println("It's Thursday");
                break;
            case 6:
                System.out.println("It's Frisday");
                break;
            case 7:
                System.out.println("It's Saturday");
                break;
            default:
                break;
        }
        sc.close();
    }
}