import java.util.*;

public class RateMaze {

    public static void RateMazeHelper(int matrix[][], int r, int c, List<String> answer, String path) {
        int n = matrix.length;
        if (c < 0 || r < 0 || c >= n || r >= n || matrix[r][c] == -1 || matrix[r][c] == 0) {
            return;
        }
        // answer
        if (r == n - 1 && c == n - 1) {
            answer.add(path);
            return;
        }
        matrix[r][c] = -1;

        // recursive call for 4 possible directions
        // 1.Up direction
        RateMazeHelper(matrix, r - 1, c, answer, path + "U");
        // 2.Down direction
        RateMazeHelper(matrix, r + 1, c, answer, path + "D");
        // 3.Right direction
        RateMazeHelper(matrix, r, c + 1, answer, path + "R");
        // 4.Left direction
        RateMazeHelper(matrix, r, c - 1, answer, path + "L");
        matrix[r][c] = 1;
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 1, 1, 0, 0 }, { 0, 1, 1, 1 } };
        List<String> ans = new ArrayList<>();
        String path = "";
        RateMazeHelper(mat, 0, 0, ans, path);
        if (ans.isEmpty()) {
            System.out.println("Not Found");
        } else {
            System.out.println("All possible path");
            for (String p : ans) {
                System.out.println(p);
            }
        }

    }
}


//T.C->O(4^n*n)  S.C->O(n)
