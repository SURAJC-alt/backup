public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        int totalSolutions = queens(board, 0);
        System.out.println("Total solutions for " + n + "-Queens: " + totalSolutions);
    }

    static int queens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) { 
                board[row][col] = true;
                count += queens(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        int n = board.length;
        for (int i = 1; i <= row; i++) {
            // Vertical check (same column, rows above)
            if (board[row - i][col]) {
                return false;
            }

            // Top-Left diagonal check
            if (col - i >= 0 && board[row - i][col - i]) {
                return false;
            }

            // Top-Right diagonal check
            if (col + i < n && board[row - i][col + i]) {
                return false;
            }
        }

        return true;
    }

    static void display(boolean[][] board) {
        for (boolean[] arr : board) {
            for (boolean element : arr) {
                if (element) {
                    System.out.print("Q "); 
                } else {
                    System.out.print("x ");
                }
            }
            System.out.println();
        }
    }
}
