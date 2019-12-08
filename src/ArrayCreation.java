public class ArrayCreation {
    public static double getAverage(double[] numbers) {

        double array_average;
        if(numbers.length<3) {
            return 0.0;
        }
        else if (numbers.length+1>=3){
            array_average = (numbers[0] + numbers[(numbers.length)/2] +numbers[numbers.length-1])/3;
        }
        else {
            return -1;
        }

        return array_average;
    }
    public static String stringArray(String[] friends) {

        String array_string_length= "";

        if(friends.length!=5) {
            return "";
        }
        else {
            for(int count=0; count<= friends.length-1;++count) {
                array_string_length +=friends[count].length() + " ";
            }
        }
return array_string_length;
    }

    public static String countryData() {

        String[] countries = {"China", "Egypt", "France", "South Korea", "Germany", "India", "Japan", "Ghana",
                "Kenya", "Mexico", "United Kingdom", "Burkina Faso", "United States"};

        String[] capitals = {"Beijing", "Cairo", "Paris", "Seoul", "Berlin", "New Delhi", "Tokyo", "Accra", "Nairobi",
                "Mexico City", "London", "Ouagadougou", "Washington D.C."};

        String[] languages = {"Mandarin", "Arabic", "French", "Korean", "German", "Hindi", "Japanese", "Akuapem Twi",
                "Swahili", "Spanish", "English", "French", "English"};

        int index_countries= countries.length;

        int random_countryData= (int)(Math.random()*index_countries);

        return "The capital of " + countries[ random_countryData] +" is " + capitals[random_countryData] +
                " and the primary language is " + languages[random_countryData];

    }




    public static void main(String[]args) {
    }

}
