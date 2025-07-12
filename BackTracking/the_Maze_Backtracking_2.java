package BackTracking;

import java.util.Arrays;

public class the_Maze_Backtracking_2 {
    public static void main(String[] args) {
        boolean[][] arr = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };
        int[][] path = new int[arr.length][arr[0].length];
        restrictions("", arr, 0, 0, path, 1);
        //DDRR DDRURD DDRUURDD DRDR DRRD DRURDD RDDR RDRD RDLDRR RRDD RRDLDR RRDLLDRR
    }

    static void restrictions(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        maze[r][c] = false;
        path[r][c] = step;
        if (r < maze.length - 1) {
            restrictions(p + "D", maze, r + 1, c, path, step + 1);
        }
        if (c < maze[0].length - 1) {
            restrictions(p + "R", maze, r, c + 1, path, step + 1);
        }
        if (r > 0) {
            restrictions(p + "U", maze, r - 1, c, path, step + 1);
        }
        if (c > 0) {
            restrictions(p + "L", maze, r, c - 1, path, step + 1);
        }
        maze[r][c] = true;
        path[r][c] = 0;
    }
}


//[1, 0, 0]
//[2, 0, 0]
//[3, 4, 5]
//DDRR
//
//[1, 0, 0]
//[2, 5, 6]
//[3, 4, 7]
//DDRURD
//
//[1, 6, 7]
//[2, 5, 8]
//[3, 4, 9]
//DDRUURDD
//
//[1, 0, 0]
//[2, 3, 0]
//[0, 4, 5]
//DRDR
//
//[1, 0, 0]
//[2, 3, 4]
//[0, 0, 5]
//DRRD
//
//[1, 4, 5]
//[2, 3, 6]
//[0, 0, 7]
//DRURDD
//
//[1, 2, 0]
//[0, 3, 0]
//[0, 4, 5]
//RDDR
//
//[1, 2, 0]
//[0, 3, 4]
//[0, 0, 5]
//RDRD
//
//[1, 2, 0]
//[4, 3, 0]
//[5, 6, 7]
//RDLDRR
//
//[1, 2, 3]
//[0, 0, 4]
//[0, 0, 5]
//RRDD
//
//[1, 2, 3]
//[0, 5, 4]
//[0, 6, 7]
//RRDLDR
//
//[1, 2, 3]
//[6, 5, 4]
//[7, 8, 9]
//RRDLLDRR