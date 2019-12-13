public class ArrayAlgorithms {
    public static String printArray(int[] nums) {

        String printed_array= "";

        for (int a:nums) {
            printed_array += a +"";
        }
return printed_array;
    }

    public static boolean checkForAllNegatives(int[] list) {
        boolean negative= true;
        for(int i=0; i<=list.length-1;++i) {
            if(list[i]>=0) {
                return false;
            }
            else
                return true;
        }

        return negative;
    }
    public static boolean hasDupes(int[] list) {
        int test_num;
        boolean duplicate;

        for(int i=0; i<list.length-1;++i) {
            for( int count= i+1; i<list.length-1;++count) {
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

        int shifted_array[]= new int [nums+shift];

    }
    public static int [] reverseArray() {

    }




    public static void main(String[]args) {

    }

}
