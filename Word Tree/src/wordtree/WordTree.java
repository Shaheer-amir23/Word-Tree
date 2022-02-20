package wordtree;

import java.util.Scanner;
import java.lang.String;

public class WordTree {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);;
        String words[], user;
        System.out.println("Input A String Of Any Length: ");
        user = input.nextLine();
        user = user.toUpperCase();
        words = user.split(" ");

        for (int i = 0; i < words.length; i++) {
            Tree(words[i]);
        }

    }

    public static void Tree(String words) {
        int spaces = 0;

        for (int x = 0; x <= words.length(); x++) {
            spaces = words.length() - x;
            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }
            for (int e = 0; e < x; e++) {
                System.out.print(words.charAt(e));
            }
            for (int w = x - 2; w >= 0; w--) {
                System.out.print(words.charAt(w));
            }
            System.out.print("\n");
        }

        for (int x = words.length() - 1; x > 0; x--) {
            spaces = words.length() - x;
            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }
            for (int e = 0; e < x; e++) {
                System.out.print(words.charAt(e));
            }
            for (int w = x - 2; w >= 0; w--) {
                System.out.print(words.charAt(w));
            }
            System.out.print("\n");
        }
        for (int x = 1; x < words.length(); x++) {
            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }
            System.out.print(words.charAt(x));
            System.out.print("\n");
        }

    }

}
