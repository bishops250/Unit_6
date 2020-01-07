public class ArrayAlgorithms {
    public static String printArray(int[] nums) {

        String printed_array= "";

        for (int a:nums) {
            printed_array += a +" ";
        }
return printed_array;
    }

    public static boolean checkForAllNegatives(int[] list) {

        boolean check_negative= true;

        for(int i=0; i<=list.length-1;++i) {
            if(list[i]>=0) {
                return false;
            }
            else
                check_negative= true;
        }
return check_negative;
    }
    public static boolean hasDupes(int[] list) {


        for(int i=0; i<=list.length-1;++i) { //First Loop Chooses Number checking for Duplicates
            for( int count= i+1; count<=list.length-1;++count) { //Second Loop checks the numbers to the side of it.
                if(list[i]==list[count]) {
                    return true;
                }

            }

        }
        return false;
    }
    public static int countEvens(int[] arr) {

        int num_evens=0;
        for(int a: arr) {
            if(a%2==0) {
                num_evens++;
            }
        }
        return num_evens;
    }

    public static int[] leftShift(int[] nums, int shift) {

        //I probably should be going backwards counting.
        int shifted_array[]= new int [nums.length+shift];
        for(int i =0;i<=nums.length-1;++i) {
           shifted_array[i]=nums[i];

            }
        return shifted_array;
        }

    public static String reverseArray(int[]nums) {

        int temp_num;
        for (int i = 0; i < nums.length/2; i++) {
            temp_num = nums[i];
            nums[i] = nums[nums.length-1-i];
            nums[nums.length-1-i]= temp_num;

        }
return printArray(nums);
    }




    public static void main(String[]args) {

    }

}
