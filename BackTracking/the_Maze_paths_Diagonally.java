package BackTracking;

import java.util.ArrayList;

public class the_Maze_paths_Diagonally {
    public static void main(String[] args) {
        System.out.println(pathsInArray("", 3, 3));  //[VVHH, VHVH, VHHV, VHD, VDH, HVVH, HVHV, HVD, HHVV, HDV, DVH, DHV, DD]
    }

    static ArrayList<String> pathsInArray(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> Mainlist = new ArrayList<>();
        if (r > 1) {
            Mainlist.addAll(pathsInArray(p + "V", r - 1, c));
        }
        if (c > 1) {
            Mainlist.addAll(pathsInArray(p + "H", r, c - 1));
        }
        if (r > 1 && c > 1) {
            Mainlist.addAll(pathsInArray(p + "D", r - 1, c - 1));
        }
        return Mainlist;
    }
}


//if (r==2 &&c==2){
//            ArrayList<String> list = new ArrayList<>();
//            return list;
//        }