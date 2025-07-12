package Strings_And_StringBuilder;

public class Length_of_Last_Word_LeetCode {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }

    static int lengthOfLastWord(String s) {
        int len = 0;
        int n = s.length() - 1;
        boolean stringOccurs = false;
        while (n >= 0) {
            if (s.charAt(n)!= ' ') {
                len++;
                stringOccurs = true;
            }
            if (stringOccurs == true && s.charAt(n) == ' ') {
                return len;
            }
            n--;
        }
        return len;
    }
}


//static int lengthOfLastWord(String s) {
//        int len = 0;
//        char[] ch = s.toCharArray();
//        int n = ch.length - 1;
//        int occur = 0;
//        while (n >= 0) {
//            if (ch[n] != ' ') {
//                len++;
//                occur = 1;
//            }
//            if (occur == 1 && ch[n] == ' ') {
//                return len;
//            }
//            n--;
//        }
//        return len;
//    }

//public int lengthOfLastWord(String s) {
//      int length = 0;
//      for (int i = s.length() - 1; i >= 0; i--) {
//        if (!Character.isWhitespace(s.charAt(i))) {
//          length++;
//        } else if (length > 0) {
//          break;
//        }
//      }
//      return length;
//    }
