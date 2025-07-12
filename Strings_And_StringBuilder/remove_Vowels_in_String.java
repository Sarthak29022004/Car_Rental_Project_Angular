package Strings_And_StringBuilder;

public class remove_Vowels_in_String {
    public static void main(String[] args) {
        System.out.println(removeVewels("Sarthak"));
    }

    static String removeVewels(String s) {
        String newStr = s.toLowerCase();
        StringBuilder name = new StringBuilder();
        for (char ch : newStr.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                continue;
            }
            name.append(ch);
        }
        return name.toString();
    }
}
