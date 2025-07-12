package Object_Oriented_Programing;

public class Constructor_Overloading {
    public static void main(String[] args) {
        Student3 pittu = new Student3(14, "Pittu", 86.8f);
        Student3 random = new Student3(pittu);
        System.out.println(random.rno);  //14
        System.out.println(random.name); //Pittu
        System.out.println(random.marks);//86.8

        Student3 random2 = new Student3();
    }
}



class Student3 {
    int rno;
    String name;
    float marks;

    Student3(Student3 other) {
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    //  Call a constructor from another constructor
    Student3() {
        this(0, "", 100.0f);  //internally : new Student(0,"",100.0f);
    }

    Student3(int rollNo, String Naam, float mark) {
        this.rno = rollNo;
        this.name = Naam;
        this.marks = mark;
    }
}