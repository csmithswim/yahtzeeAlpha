package com.csmithswim;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Console {
    static Scanner scanner = new Scanner(System.in);

    static public void welcome(){
        System.out.println("Welcome to Yahtzee");
    }

    static public int getChoice(){
        System.out.println("Pick a die 1-5 to re-roll: ");
        int choice = scanner.nextInt();
        return choice - 1;
    }

    //Cliff's
    //Always do logic, then validation and then sanitization
    static public List<Integer> getChoicesCliff(){
        List<Integer> choices = new ArrayList<>();
        System.out.println("Which dice do you want to re roll?");
        String input = scanner.next();
        String[] inputArray = input.split(" ");
        for (String number : inputArray) {
            choices.add(Integer.parseInt(number) -1);
        }
        return choices;
    }

    //my solution
     static public List<Integer> getChoices(){
         System.out.println("Pick any die 1-5 to re-roll: ");
         String choice = scanner.nextLine();
         String splitChoice[] = choice.split("");
         List<Integer> choices = new ArrayList<>();

         for (var i : splitChoice) {
             int userInput = Integer.parseInt(i)-1;
             choices.add(userInput);
         }

         return choices;
     }

}


