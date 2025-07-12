package Object_Oriented_Programing;

public class Human2 {
    public static void main(String[] args) {
        Human sarthak = new Human(21, "Sarthak Bobhate", 500000, true);
        Human nagesh = new Human(23, "Nagesh Bobhate", 500000, true);
        System.out.println(sarthak.name);
        System.out.println(Human.population);   // Right Approach
        System.out.println(nagesh.population);  // Wrong Approach

        Human2 obj = new Human2();
        obj.greet();
    }

    static void fun() {
        fun2();
//        greeting();  //you can't use this because it requires an instance  => error
// You cannot access non-static stuff without referencing their instances in a static context
        Human2 obj = new Human2();
        obj.greeting();
    }

    static void fun2() {

    }

    void greet() {
        greeting();
    }

    void greeting() {
        greeting2();
    }

    void greeting2() {
    }
}
