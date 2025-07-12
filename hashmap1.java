import java.util.HashMap;

public class hashmap1 {
    public static void main(String[]args) {
        HashMap<String, Integer> empid = new HashMap<>();
        empid.put("Sarthak", 1);
        empid.put("Nagesh", 2);

        System.out.println(empid);  //{Nagesh=2, Sarthak=1}
        System.out.println(empid.get("Sarthak"));  //1
        System.out.println(empid.containsKey("Nagesh"));  //true
        System.out.println(empid.containsValue(1));   //true

        empid.put("Nagesh",3); //put
        System.out.println(empid);                    //{Nagesh=3, Sarthak=1}
        empid.replace("Akshay",4); //replace
        System.out.println(empid);                    //no change
        empid.replace("Sarthak",4); //replace
        System.out.println(empid);                   //{Nagesh=3, Sarthak=4}
        empid.putIfAbsent("Akshay",4); //putIfAbsent
        System.out.println(empid);                   //{Akshay=4, Nagesh=3, Sarthak=1}
        empid.remove("Akshay"); //remove
        System.out.println(empid);                   //{Nagesh=3, Sarthak=1}
    }
}