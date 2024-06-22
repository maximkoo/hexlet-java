package io.hexlet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MindGames {
    public static String playerName;

    public static void main(String[] args) {
        //playerName = askPlayerName();
        greet();
        progression();

    }

    public static void greet() {
        if (playerName == null) {
            playerName = askPlayerName();
        }
        System.out.println("Hello, " + playerName);
    }

    public static String askPlayerName() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        //String in = sc.nextLine();
        //return in;
        return sc.nextLine();
    }

    public static void progression() {
        List<Integer> pro1 = new ArrayList(List.of(14, 16, 18, 20, 22, 24, 26, 28));
        List<Integer> pro2 = new ArrayList(List.of(5, 6, 7, 8, 9, 10, 11, 12));
        List<Integer> pro3 = new ArrayList(List.of(12, 15, 18, 21, 24, 27, 30, 33));
        List<List<Integer>> pros = new ArrayList<>(List.of(pro1, pro2, pro3));
        List<Integer> answers = new ArrayList(List.of(16, 10, 24));
        Integer correctAnswers = 0;
        //
        System.out.println("What number is missing in this progression?");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int finalI = i;
            String p = pros.get(i).stream().map(x -> x.toString()).map(x -> x.equals(answers.get(finalI).toString()) ? ".." : x).collect(Collectors.joining(" "));
            System.out.println("Question: " + p);
            String in = sc.nextLine();
            System.out.println("Your answer:" + in.toString());
            if (in.equals(answers.get(i).toString())) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'"+in + "'"+" is wrong answer ;(. Correct answer was '"+answers.get(i)+"'.");
                System.out.println("Let's try again, "+playerName+"!");
                break;
            }
        }
    }
}

//What number is missing in this progression?
//    Question: 14 .. 18 20 22 24 26 28

//'1000' is wrong answer ;(. Correct answer was '304'.
//        Let's try again, Tirion!
