import java.util.ArrayList;

class ContainerWithWaterArray {
    public static int StoredWater(ArrayList<Integer> height) {
        int maxwater = 0;
        int left = 0;
        int right = height.size() - 1;

        while (left < right) {
            int ht = Math.min(height.get(left), height.get(right));
            int width = right - left;
            int currwater = ht * width;
            maxwater = Math.max(maxwater, currwater);

            // Update pointers
            if (height.get(left) < height.get(right)) {
                left++;
            } else {
                right--;
            }
        }
        return maxwater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(StoredWater(height)); // Output should be 49
    }
}
