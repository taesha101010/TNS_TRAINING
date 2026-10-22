
public class FloodFill {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int originalColor = image[sr][sc];

        if (originalColor == color) {
            return image;
        }

        fill(image, sr, sc, originalColor, color);

        return image;
    }

    public void fill(int[][] image, int r, int c,
                     int originalColor, int color) {

        // Stop if outside the image
        if (r < 0 || r >= image.length ||
            c < 0 || c >= image[0].length) {
            return;
        }

        // Stop if the pixel has a different original color
        if (image[r][c] != originalColor) {
            return;
        }

        // Change the current pixel
        image[r][c] = color;

        // Check all four neighbours
        fill(image, r - 1, c, originalColor, color);
        fill(image, r + 1, c, originalColor, color);
        fill(image, r, c - 1, originalColor, color);
        fill(image, r, c + 1, originalColor, color);
    }

    // main() must be outside both methods above
    public static void main(String[] args) {

        FloodFill obj = new FloodFill();

        int[][] image = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };

        int[][] result = obj.floodFill(image, 1, 1, 2);

        for (int[] row : result) {
            System.out.println(java.util.Arrays.toString(row));
        }
    }
}
