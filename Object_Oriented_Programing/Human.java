package Object_Oriented_Programing;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message(){
//        this.age;  //cannot be referenced from a static context
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }
}
