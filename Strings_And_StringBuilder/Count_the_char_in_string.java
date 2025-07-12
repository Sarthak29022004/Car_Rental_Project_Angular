package Strings_And_StringBuilder;

public class Count_the_char_in_string {
    public static void main(String[] args) {
        System.out.println(countchar("11112"));
    }

    static String countchar(String n){
        String s = "";
        int len = n.length();
        int count = 0;
        for (int i = 0; i < len; i++) {
            count++;
            if(i==len-1 || s.charAt(i)!=s.charAt(i+1)){
                s += count + s.charAt(i);
                count=0;
            }
        }
        
        return s;
    }
}
