import java.util.Arrays;

public class methods2 {
    public static void main(String[] args) {

        String name = "Sarthak";
        changeName(name);
        System.out.println(name);

        int[] arr = {1, 2, 3, 4, 5};
        changeArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void changeName(String naam) {
//        System.out.println(naam);
        naam = "Nagesh";
    }

    static void changeArr(int[] arrays) {
        arrays[0] = 99;
    }
}
