/*
Creator: Aron Bishop
AP Computer Science
Date: January 8, 2019 10:00am
Program name: BirthdayParadox

BirthdayParadox tests the paradox that in a room of 23 approximately 50% of the individuals in a room, will share a
birth date. Typical convention would state that random person having the same birthday as another random person would be
 1/365 or 0.0027%. in essence to meet an individual with the same birthday as the individual you would need half of 365,
 which is 183. According to the Paradox only 23 people are needed to have 50%. This program allows to test vary amounts
 of people, with random birthdays. The percentage is determined by running the test a thousand times and determining
 the amount of times a duplicate birthday was found.


 */

import java.util.Scanner; /*Class for reading user input-utilized to select the amount of individuals in the room
to test the birthday paradox. */

public class BirthdayParadox {


    public static int[] dates(int individuals) {


        int[] birth_date = new int[individuals]; //creates an array of user selected size.


        for (int i = 0; i < individuals; i++) {
            int random_num = (int) (Math.random() * 364 + 1); /*randomly chooses a day of year.

            */
            birth_date[i] = random_num; //sets the random day to array.

        }

        return birth_date; //returns the array with the random dates.
    }

    public static boolean hasDupes(int[] list) {


        for (int i = 0; i <= list.length - 1; ++i) { //First Loop Chooses Number checking for Duplicates
            for (int count = i + 1; count <= list.length - 1; ++count) { /*Second Loop checks the numbers to
             the side of it.
                */
                if (list[i] == list[count]) { //if there is a duplicate returns true.
                    return true;
                }

            }

        }
        return false; //if there is no duplicate returns false.
    }

    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in); //creates a scanner.

        int individuals;  //variable to store amount of individuals in the room

        double num_of_dubs = 0.0; // the variable that stores the amount of duplicate birthdays in the user selected room

        System.out.println("Please input the amount of individuals in the room: "); /*prompts user to select the amount
        of individuals in a room */

        individuals= user_input.nextInt(); //sets user input to the variable individuals

        System.out.println("User Selected: " + individuals); //tells the user the amount of users they selected


        for (int count = 0; count < 1000; count++) { // Loop to run the method dates a thousand times
            int[] count_array = dates(individuals); //stores the result of thousand runs of the method dates into the array

            if (hasDupes(count_array)) { /*tests if the count_array has dupplicate dates if it does it iterates one
            if not it does nothing*/
                num_of_dubs++; //iterates one to variable if hasDupes==true
            }

        }
        double percentage= num_of_dubs/1000 * 100; // the calculations to determine percentage

        System.out.println("With " + individuals + " In a room about " + percentage +
                " are likely to share a birth date.");

    }
}
