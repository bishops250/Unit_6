public class TraverseArrays {
    public static int countEven(int[] nums) {

        int num_evens = 0;

        for (int i = 0; i <= nums.length-1; ++i) {
            if (nums[i] % 2 == 0) {
                num_evens += 1;
            } else {
                num_evens += 0;
            }
        }

        return num_evens;
    }

    public static int[] buildArray(int desiredLength) {

        int[] list = new int[desiredLength];

        for (int count = 0; count <= desiredLength-1; ++count) {
            list[count] = count;

        }

        return list;
    }

    public static boolean sum28(int[] numbers) {

        int num_sum = 0;

        for (int count = 0; count <= numbers.length-1; ++count) {
            if (numbers[count] == 2) {
                num_sum += 2;

            }

        }
        return num_sum == 8;
    }

    public static int[] zeroMax(int[] original) {



        for (int count = 0; count <= original.length-1; ++count) {
            if (original[count] == 0) {
                for (int count2 = count; count2 < original.length - 1; count2++) {

                    if(original[count2] < (original[count2+1]) && original[count2+1] % 2 != 0) {
                        original[count2] = original[count2 + 1];
                    }
                }

            }
        }
        return original;
    }

    public static void main(String[] args) {

    }
}