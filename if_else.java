import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age : ");
        int n = sc.nextInt();

        if (n >= 18) {
            System.out.println("You are an Adult");
        }else{
            System.out.println("You are not an Adult");
        }
        sc.close();
    }
}