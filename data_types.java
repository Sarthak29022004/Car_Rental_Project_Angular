import java.util.Scanner;

public class data_types {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String user = sc.nextLine();
        System.out.println("The String is : " + user);

        // Input & Output for the character
        System.out.print("Enter the Character :");
        char s=sc.next().charAt(0);
        System.out.println("The Character is : " + s);
        sc.close();
    }
}
