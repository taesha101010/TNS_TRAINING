public class ThirdMax {

    public static int thirdMax(int[] nums) {

        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int num : nums) {

            // Skip duplicate numbers
            if (num == first || num == second || num == third) {
                continue;
            }

            // Find the largest number
            if (num > first) {
                third = second;
                second = first;
                first = num;
            }
            // Find the second-largest number
            else if (num > second) {
                third = second;
                second = num;
            }
            // Find the third-largest number
            else if (num > third) {
                third = num;
            }
        }

        // If the third maximum doesn't exist, return the maximum
        if (third == Long.MIN_VALUE) {
            return (int) first;
        }

        return (int) third;
    }

    public static void main(String[] args) {

        int[] nums = {2, 2, 3, 1};

        int result = thirdMax(nums);

        System.out.println("Third maximum: " + result);
    }
}