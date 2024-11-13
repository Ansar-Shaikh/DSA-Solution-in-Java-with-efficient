class FloodFillAlgorithm {
    public static  void helper(int[][] image, int sr, int sc, int color, int orgcolor) {
        // base case
        if (sc < 0 || sr < 0 || sr >= image.length|| sc >= image[0].length || image[sr][sc] != orgcolor) {
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

    public static  int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int orgcolor = image[sr][sc];
        // If the starting pixel is already the desired color, no need to fill
        if (orgcolor == color) {
            return image;
        }

        // Perform the flood fill
        helper(image, sr, sc, color, orgcolor);
        return image;
    }
	 public static void main(String[] args) {
        // Example input image (2D array) and starting position (sr, sc)
        int[][] image = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };
        int sr = 1, sc = 1; // starting pixel
        int newColor = 2;   // new color to fill

        
        
        // Perform flood fill
        int[][] result =floodFill(image, sr, sc, newColor);

        // Print the resulting image
        System.out.println("Flood filled image:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
