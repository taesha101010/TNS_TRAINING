
import java.util.Arrays;

// Move all zeros to the end
public class MoveZeros {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 0, 4, 5, 6, 0, 7, 8, 0};

        int[] result = new int[nums.length];
        int j = 0;

        // Copy non-zero numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                result[j] = nums[i];
                j++;
            }
        }

        // Copy everything back
        for (int i = 0; i < nums.length; i++) {
            nums[i] = result[i];
        }

        
        System.out.println(Arrays.toString(nums));
    }
}
