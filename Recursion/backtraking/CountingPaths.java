import java.util.ArrayList;

public class CountingPaths {
    public static void main(String[] args) {
        // System.out.println(
        boolean[][] arr = { { true, true, true },
                { true, false, true },
                { true, true, true } };
        pathRistric("", arr, 0, 0);
    }

    static int count(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }
        int left = count(row - 1, col);
        int right = count(row, col - 1);
        return left + right;
    }

    static ArrayList<String> path(String p, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> base = new ArrayList<>();
            base.add(p);
            return base;
        }
        ArrayList<String> ans = new ArrayList<>();
        if (row > 1) {
            ans.addAll(path(p + " D ", row - 1, col));
        }
        if (col > 1) {
            ans.addAll(path(p + " R ", row, col - 1));
        }
        return ans;
    }

    static ArrayList<String> pathDio(String p, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> base = new ArrayList<>();
            base.add(p);
            return base;
        }
        ArrayList<String> ans = new ArrayList<>();
        if (row > 1) {
            ans.addAll(pathDio(p + "D", row - 1, col));
        }
        if (col > 1 && row > 1) {
            ans.addAll(pathDio(p + " | ", row - 1, col - 1));
        }
        if (col > 1) {
            ans.addAll(pathDio(p + "R", row, col - 1));
        }
        return ans;
    }

    static void pathRistric(String p, boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[row][col]) {
            return;
        }
        if (row < maze.length - 1) {
            pathRistric(p + "D", maze, row + 1, col);
        }
        if (col < maze[0].length - 1) {
            pathRistric(p + "R", maze, row, col + 1);
        }
    }
}