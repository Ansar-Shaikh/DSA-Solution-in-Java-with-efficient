class FloodFillAlgorithm {
    public void helper(int[
[] image, int sr, int sc, int color, int orgcolor) {
        // base case
        if (sc < 0 || sr < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != orgcolor) {
            return;
        }
        // Change color
        image[sr][sc] = color;

        // Recursive calls in all four directions
        helper(image, sr, sc - 1, color, orgcolor); // left
        helper(image, sr, sc + 1, color, orgcolor); // right
        helper(image, sr - 1, sc, color, orgcolor); // up
        helper(image, sr + 1, sc, color, orgcolor); // down
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int orgcolor = image[sr][sc];
        // If the starting pixel is already the desired color, no need to fill
        if (orgcolor == color) {
            return image;
        }

        // Perform the flood fill
        helper(image, sr, sc, color, orgcolor);
        return image;
    }
}