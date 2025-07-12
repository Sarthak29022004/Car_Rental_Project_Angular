package Object_Oriented_Programing;

import java.util.Arrays;

public class Class1 {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        System.out.println(Arrays.toString(students));  //[null, null, null, null, null]

        Student sarthak = new Student();
        System.out.println(sarthak);  //Object_Oriented_Programing.Student@6acbcfc0
        System.out.println(sarthak.rno);  //0
        System.out.println(sarthak.name);  //null
        System.out.println(sarthak.marks);  //0.0

        sarthak.rno=14;
        sarthak.name="Sarthak";
        sarthak.marks=86.8f;
        System.out.println(sarthak.rno);  //14
        System.out.println(sarthak.name);  //Sarthak
        System.out.println(sarthak.marks);  //86.8

        Student nagesh = new Student();
        nagesh.rno=18;
        nagesh.name="Nagesh";
        System.out.println(nagesh.rno);  //18
        System.out.println(nagesh.name);  //Nagesh
        System.out.println(nagesh.marks);  //90.0  => by default 90

        Student akshay = new Student();
        System.out.println(akshay.rno);   //20
        System.out.println(akshay.name);  //Akshay
        System.out.println(akshay.marks); //90.0

        Student s4 = new Student();
        System.out.println(s4.rno);  //20
        System.out.println(s4.marks);  //90.0
        System.out.println(s4.name); //Akshay
    }
}

class Student {
    int rno;
    String name;
    float marks;

    Student(){
        this.rno = 20;
        this.name = "Akshay";
        this.marks = 90.0f;
    }
}