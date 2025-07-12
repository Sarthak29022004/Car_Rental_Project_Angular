package ArraysJava;

public class Second_Largest_Digit_in_String {
    public static void main(String[] args) {
        String s = "dfa12321a";
        char[] ch=s.toCharArray();
        int max=0;
        for(char i:ch){
            if(i<'9' && i>='0'){
               max=i;
            }
        }
        System.out.println(max);
    }
}
