public class ArrayAlgorithms {
    public static String printArray(int[] nums) {

        String printed_array= "";

        for (int a:nums) {
            printed_array += a +" ";
        }
return printed_array;
    }

    public static boolean checkForAllNegatives(int[] list) {

        boolean check_negative=true;

        for(int i=0; i<=list.length-1;++i) {
            if(list[i]>0) {
                check_negative=false;
            }
            else
                check_negative= true;
        }

        return check_negative;
    }
    public static boolean hasDupes(int[] list) {


        for(int i=0; i<=list.length-1;++i) {
            for( int count= i+1; i<=list.length-1;++count) {
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

        int shifted_array[]= new int [nums.length+shift];
        for(int i =0;i>=nums.length-1;++i) {
            for (int count = (shifted_array.length-1)-shift; count >= 0; --count) {
                shifted_array[count]=nums[i]; //this doesn't work
            }
        }
        return shifted_array;
    }
    public static int [] reverseArray(int[]nums) {
       int temp_num;
        for(int i =0;i<=nums.length-1;++i) {
            temp_num= nums[i+1];
            nums[i+1]=nums[i];
            nums[i]= temp_num;
        }
return nums;
    }




    public static void main(String[]args) {

    }

}
