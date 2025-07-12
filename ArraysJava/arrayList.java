package ArraysJava;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {

//      ArrayList<Data_type> ref_var = new Arraylist<Data_type>(Initial_capacity);           Data_type = wrapperClass
        ArrayList<Integer> list = new ArrayList<>(10);  //always pass wrapper class in data_types, not the primitives

//        int c=0;
//        while (c<20){
//            list.add((int)(Math.random()*100));
//            c++;
//        }
        list.add(34);
        list.add(67);
        list.add(89);
        list.add(53);
        list.add(83);
        list.add(24);
        list.add(17);
        list.add(74);
        list.add(94);
        list.add(67);
        list.add(46);
        list.add(96);
        list.add(10);
        list.add(37);
        list.add(95);
        list.add(27);
        list.add(94);
        list.add(49);

        System.out.println(list);   //[34, 67, 89, 53, 83, 24, 17, 74, 94, 67, 46, 96, 10, 37, 95, 27, 94, 49]

        System.out.println(list.get(5));   //24
        list.set(2, 83);    //replace 2nd index element

        System.out.println(list);    //[34, 67, 83, 53, 83, 24, 17, 74, 94, 67, 46, 96, 10, 37, 95, 27, 94, 49]
        list.remove(3);
        System.out.println(list);    //[34, 67, 83, 83, 24, 17, 74, 94, 67, 46, 96, 10, 37, 95, 27, 94, 49]

    }

}
