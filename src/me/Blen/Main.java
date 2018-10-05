package me.Blen;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> words = new ArrayList<String>();
        words.add("tree");
        words.add("rain");
        words.add("bear");
        words.add("encourage");
        words.add("promise");
        words.add("soup");
        words.add("chess");
        words.add("insurance");
        words.add("pancakes");
        words.add("stream");

       /* System.out.println("Please enter the letter of the word you would like to guess");
        Scanner scan = new Scanner(System.in);
        String letterGuessed = scan.nextLine();*/

        int randomWord= (int)(Math.random() * words.size());
        System.out.println(words[randomWord]);

        /*int i=1;
        do
        {

            int guessesLeft = 5-i;
            System.out.println("You have made " + i + "guesses and is left with " + guessesLeft + "guesses");
            i++;
        }while(i<=5);
        System.out.println("You have exceeded your guesses");*/
    }
}
