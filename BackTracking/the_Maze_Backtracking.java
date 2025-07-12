package BackTracking;

public class the_Maze_Backtracking {
    public static void main(String[] args) {
        boolean[][] arr = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };
        restrictions("", arr, 0, 0);
        //DDRR DDRURD DDRUURDD DRDR DRRD DRURDD RDDR RDRD RDLDRR RRDD RRDLDR RRDLLDRR
    }

    static void restrictions(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.print(p + " ");
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        maze[r][c] = false;
        if (r < maze.length - 1) {
            restrictions(p + "D", maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            restrictions(p + "R", maze, r, c + 1);
        }
        if (r > 0) {
            restrictions(p + "U", maze, r - 1, c);
        }
        if (c > 0) {
            restrictions(p + "L", maze, r, c - 1);
        }
        maze[r][c] = true;
    }
}
