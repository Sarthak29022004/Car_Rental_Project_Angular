package BackTracking;

import java.util.ArrayList;

public class the_Maze_print_all_paths {
    public static void main(String[] args) {
        printPaths("", 3, 3);
        System.out.println(pathsInArray("", 3, 3));  //[DDRR, DRDR, DRRD, RDDR, RDRD, RRDD]
    }

    static ArrayList<String> pathsInArray(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> Mainlist = new ArrayList<>();
        if (r > 1) {
            Mainlist.addAll(pathsInArray(p + "D", r - 1, c));
        }
        if (c > 1) {
            Mainlist.addAll(pathsInArray(p + "R", r, c - 1));
        }
        return Mainlist;
    }

    static void printPaths(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            printPaths(p + "D", r - 1, c);
        }
        if (c > 1) {
            printPaths(p + "R", r, c - 1);
        }
    }
}

//DDRR
//DRDR
//DRRD
//RDDR
//RDRD
//RRDD