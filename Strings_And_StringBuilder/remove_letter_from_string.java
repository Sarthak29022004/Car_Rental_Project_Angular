package Strings_And_StringBuilder;

public class remove_letter_from_string {
    public static void main(String[] args) {
        System.out.println(change("Sarthak"));   //Srthk
    }
    static String change(String str){
        StringBuilder ans = new StringBuilder();
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)!='a'){
                ans.append(str.charAt(i));
            }
        }
        return ans.toString();
    }
}
