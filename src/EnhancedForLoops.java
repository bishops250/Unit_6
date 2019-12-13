public class EnhancedForLoops {

    public static String printStandardFor(String[] arr){
        String printed_string= "";
        for(int i=0; i<= arr.length-1;++i) {
            printed_string += arr[i] + " ";
        }
        return printed_string;
    }

    public static String printStandardFor(int[] arr) {

        String print_value = "";
        for (int i = 0; i <= arr.length-1; ++i ) {
            print_value += arr[i] + " ";
        }
        return print_value;
    }

    public static String printStandardFor(double[] arr) {
        String printed_value="";
        for(int i=0; i<= arr.length-1; ++i) {
            printed_value += arr[i] + " ";
        }
        return printed_value;
    }

    public static String printEnhancedFor(String[] arr){
        String print_string= "";
        for(String a: arr) {
            print_string += a + " ";
        }
        return print_string;
    }

    public static String printEnhancedFor(int[] arr){
        String print_integer= "";
        for(int a: arr) {
            print_integer += a +" ";
        }
        return print_integer;
    }

    public static String printEnhancedFor(double[] arr){
        String print_double = "";
        for(double a: arr) {
            print_double += a + " ";

        }
        return print_double;
    }

    public static String printStandardWhile(String[] arr) {
        String print_string= "";
        int i=0;
        while(i<arr.length) {
            print_string += arr[i] + " ";
            ++i;
        }
        return print_string;
    }

    public static String printStandardWhile(int[] arr) {
        String print_value= "";
        int i=0;
        while (i<arr.length) {
            print_value += arr[i] + " ";
            ++i;
        }
        return print_value;
    }

    public static String printStandardWhile(double[] arr) {
        String printed_value= "";
        int i=0;
        while(i<arr.length) {
            printed_value += arr[i] + " ";
            ++i;
        }
        return printed_value;
    }


    public static void main(String[]args) {

        int[] integer_array ={1,2,3,4,5};
        double[] double_array ={1.1,2.2,3.3,4.4,5.5};
        String[] string_array = {"Bob","Jeff","Larry","Aron","Blake"};
        

    }
}
