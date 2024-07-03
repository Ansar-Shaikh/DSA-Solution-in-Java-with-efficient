class CheeseBoard {
    public static void nqueens(char board[][], int row) {
        // Base case
        if (row == board.length) {
            printqueen(board);
            return;
        }
        // For columns
        for (int i = 0; i < board.length; i++) {
            board[row][i] = 'Q';
            nqueens(board, row + 1);
            board[row][i] = 'X'; // Backtracking
        }
    }

    public static void printqueen(char board[][]) {
        System.out.println("********** Chess Board ************");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println(); // Add line break for proper display
        }
    }

    public static void main(String[] args) {
        int n = 2;
        char board[][] = new char[n][n];
        
        // Initialization
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        nqueens(board, 0);
    }
}
