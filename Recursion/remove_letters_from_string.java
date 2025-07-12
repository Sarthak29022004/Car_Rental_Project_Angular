package Recursion;

public class remove_letters_from_string {
    public static void main(String[] args) {
        System.out.println(change("Sarthak", 0));   //Srthk
        skip("","Sarthak");//Srthk
    }

    static String change(String str, int i) {
        if (i == str.length()) return "";
        if (str.charAt(i) != 'a') return str.charAt(i) + change(str, i + 1);
        return change(str, i + 1);
    }

    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);      //Srthk
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }
}
