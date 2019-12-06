public class ArrayCreation {
    public static double getAverage(double[] numbers) {

        double array_average;
        if(numbers.length+1<3) {
            return 0.0;
        }
        else if (numbers.length+1>=3){
            array_average = ((numbers[0] + numbers[(numbers.length-1)/2] +numbers[numbers.length-1])/3);
        }
        else {
            return -1;
        }

        return array_average;
    }
    public static String stringArray(String[] friends) {

        String array_string_length= "";
        if(friends.length-1!=5) {
            return "";
        }
        else {
            for(int count=0; count<= friends.length;++count) {
                
            }
        }

    }
    public static String countryData() {

    }



    public static void main(String[]args) {
    }

}
