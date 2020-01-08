/*
Creator: Aron Bishop
AP Computer Science
Date: January 8, 2019 10:00am
Program name: BirthdayParadox

BirthdayParadox tests the paradox that in a room of 23 approximately 50% of the individuals in a room, will share a
birth date.



working on it

 */

import java.util.Scanner;

public class BirthdayParadox {


    public static int[] dates(int individuals) {
        int[] birth_date = new int[individuals];


        for (int i = 0; i < individuals; i++) {
            int random_num = (int) (Math.random() * 364 + 1);
            birth_date[i] = random_num;

        }

        return birth_date;
    }

    public static boolean hasDupes(int[] list) {


        for (int i = 0; i <= list.length - 1; ++i) { //First Loop Chooses Number checking for Duplicates
            for (int count = i + 1; count <= list.length - 1; ++count) { //Second Loop checks the numbers to the side of it.
                if (list[i] == list[count]) {
                    return true;
                }

            }

        }
        return false;
    }

    public static void main(String[] args) {

        int individuals;

        System.out.println();
        System.out.println("Please select the amount of individuals in the room: ");


        double num = 0.0;
        for (int count = 0; count < 1000; count++) {
            int[] data = dates(23);

            if (hasDupes(data)) {
                num++;
            }

        }
        double percentage= num/1000 * 100;
        System.out.println(percentage);
    }
}
