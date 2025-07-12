package BackTracking;

import java.util.ArrayList;

public class the_Maze_restrictions {
    public static void main(String[] args) {
        boolean[][] arr = {
                {true, true, true},
                {true, false, true},
                {true, true, true},
        };
        restrictions("", arr, 0, 0); //DDRR RRDD
        System.out.println(restrictionsArray("", arr, 0, 0)); //[DDRR, RRDD]
    }

    static ArrayList<String> restrictionsArray(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        if (!maze[r][c]) {
            return new ArrayList<>();
        }
        ArrayList<String> Mainlist = new ArrayList<>();
        if (r < maze.length - 1) {
            Mainlist.addAll(restrictionsArray(p + "D", maze, r + 1, c));
        }
        if (c < maze[0].length - 1) {
            Mainlist.addAll(restrictionsArray(p + "R", maze, r, c + 1));
        }
        return Mainlist;
    }

    static void restrictions(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.print(p + " ");
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        if (r < maze.length - 1) {
            restrictions(p + "D", maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            restrictions(p + "R", maze, r, c + 1);
        }
    }
}
