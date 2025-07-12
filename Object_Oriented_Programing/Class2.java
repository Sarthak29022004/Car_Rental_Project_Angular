package Object_Oriented_Programing;

public class Class2 {
    public static void main(String[] args) {
        Students sarthak = new Students();
        System.out.println(sarthak.rno);   //20
        System.out.println(sarthak.name);  //Sarthak
        System.out.println(sarthak.marks); //90.0

        sarthak.greeting();   //My name is Sarthak

        sarthak.changeName("Pittu");
        sarthak.greeting();     //My name is Pittu

    }
}

class Students {
    int rno;
    String name;
    float marks;

    void greeting() {
        System.out.println("My name is " + name);
    }

    void changeName(String newName) {
        name = newName;
    }

    Students() {
        this.rno = 20;
        this.name = "Sarthak";
        this.marks = 90.0f;
    }
}
