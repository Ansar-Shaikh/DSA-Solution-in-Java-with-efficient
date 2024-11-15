class fourGridPath  {
    public static void Grid(int i, int j, int n, int m, boolean[][] isVisited, String str) {
        // Check if current position is out of the grid boundaries
        if (i < 0 || j < 0 || i >= n || j >= m) {
            return;
        }

        // Check if the current cell is the bottom-right corner
        if (i == n - 1 && j == m - 1) {
            System.out.println(str);
            return;
        }

        // Check if the current cell is already visited
        if (isVisited[i][j]) {
            return;
        }

        // Mark the current cell as visited
        isVisited[i][j] = true;

        // Explore the four possible directions

        // Move Left
        Grid(i, j - 1, n, m, isVisited, str + "L");

        // Move Down
        Grid(i + 1, j, n, m, isVisited, str + "D");

        // Move Right
        Grid(i, j + 1, n, m, isVisited, str + "R");

        // Move Up
        Grid(i - 1, j, n, m, isVisited, str + "U");

        // Mark the current cell as unvisited (backtracking)
        isVisited[i][j] = false;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        boolean[][] isVisited = new boolean[n][m];
        Grid(0, 0, n, m, isVisited, "");
    }
}
