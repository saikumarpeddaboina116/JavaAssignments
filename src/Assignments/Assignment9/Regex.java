package Assignments.Assignment9;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        System.out.println("Enter the regex pattern");
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String pattern;
        pattern = "^[A-Z].*(.)$";
        if (Pattern.matches(pattern,input))

            System.out.println("The given sentence starts with capital letter and end with period");

        else
            System.out.println("The given sentence does not starts with capital letter and does not end with period");
    }
    }