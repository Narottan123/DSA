public class KnightProblem {
    static int[] rowmoves = { 2, 1, -1, -2, -2, -1, 1, 2 };
    static int[] colmoves = { 1, 2, 2, 1, -1, -2, -2, -1 };

    public static void KnightTour(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = -1;
            }
        }
        matrix[0][0] = 0;
        if (traverse(0, 0, n, 1, matrix)) {
            // print solution
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        } else {
            System.out.println("No solution exist");
        }

    }

    public static boolean traverse(int x, int y, int n, int move, int[][] matrix) {
        int nextX, nextY;
        if (move == n * n) {
            return true;
        }
        for (int i = 0; i < 8; i++) {
            nextX = x + rowmoves[i];
            nextY = y + colmoves[i];
            if (safe(nextX, nextY, n, matrix)) {
                matrix[nextX][nextY] = move;
                if (traverse(nextX, nextY, n, move + 1, matrix)) {
                    return true;
                } else {
                    matrix[nextX][nextY] = -1;
                }
            }

        }
        return false;

    }

    public static boolean safe(int x, int y, int n, int[][] matrix) {
        if (x >= 0 && y >= 0 && x < n && y < n && matrix[x][y] == -1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        KnightTour(5);
    }
}
