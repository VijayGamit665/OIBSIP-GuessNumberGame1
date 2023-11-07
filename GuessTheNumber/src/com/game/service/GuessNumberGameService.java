package com.game.service;

import com.game.main.Main;

import javax.swing.*;

public class GuessNumberGameService {
    public static int guessingNumber() {

        JOptionPane panel = new JOptionPane("Well Come to The Guess Number Game"); // its is uses to MessageDialog and
        int randomNum = (int) (Math.random() * 100) + 1; // use to generate random number

        panel.showMessageDialog(null, "Welcome to the Number Guessing Game!");
        panel.showMessageDialog(null, "Chooses a Number between 1 to 100");


        for (int i = 10; i > 0; i--) {  // for loop use for limiting attempts

            panel.showMessageDialog(null, "You Have " + i + " guess left. Try Again");
            String userInput = panel.showInputDialog("Guess the Number");  //  use to  user input
            int guess = Integer.parseInt(userInput);  // guess use to  user input

            int targetAttempt = 1;

            if (randomNum < guess) {
                Main.attempts++;
                panel.showMessageDialog(null, "Your number Smaller then " + guess + " guess");
                updateLabels();
                if (targetAttempt == i) {
                    addMoreRounds();
                }
            } else if (randomNum > guess) {
                Main.attempts++;
                panel.showMessageDialog(null, "Your Number Largest then " + guess + " guess");
                updateLabels();
                if (targetAttempt == i) {
                    addMoreRounds();
                }
            } else {
                Main.attempts++;
                panel.showMessageDialog(null, "Your guess number is Correct Are you Win");
                updateLabels();
                panel.showMessageDialog(null, "Are Guess is = " + Main.attempts);
                // int score = 0;
                Main.score = 0;
                updateLabels();
                switch (Main.attempts) {  // while loop is uses for score calculate
                    case 1:
                        if (Main.attempts == 1) {
                            Main.score = 10;
                            Main.current += Main.score;
                            break;
                        }
                    case 2:
                        if (Main.attempts == 2) {
                            Main.score = 9;
                            Main.current += Main.score;
                            break;
                        }
                    case 3:
                        if (Main.attempts == 3) {
                            Main.score = 8;
                            Main.current += Main.score;
                            break;
                        }
                    case 4:
                        if (Main.attempts == 4) {
                            Main.score = 7;
                            Main.current += Main.score;
                            break;
                        }
                    case 5:
                        if (Main.attempts == 5) {
                            Main.score = 6;
                            Main.current += Main.score;
                            break;
                        }
                    case 6:
                        if (Main.attempts == 6) {
                            Main.score = 5;
                            Main.current += Main.score;
                            break;
                        }
                    case 7:
                        if (Main.attempts == 7) {
                            Main.score = 4;
                            Main.current += Main.score;
                            break;
                        }
                    case 8:
                        if (Main.attempts == 8) {
                            Main.score = 3;
                            Main.current += Main.score;
                            break;
                        }
                    case 9:
                        if (Main.attempts == 9) {
                            Main.score = 2;
                            Main.current += Main.score;
                            break;
                        }
                    case 10:
                        if (Main.attempts == 10) {
                            Main.score = 1;
                            Main.current += Main.score;
                            break;
                        }
                }
                updateLabels();
                panel.showMessageDialog(null, "your Current Score is = " + Main.score);
                addMoreRounds();
            }
        }
        return Main.current;
    }

    public static void updateLabels() {
        SwingUtilities.invokeLater(() -> {
            Main.label.setText("Total Score = " + Main.current);
            Main.label1.setText("Total Attempts = " + Main.attempts);
            Main.label2.setText("Current Score = " + Main.score);
        });
    }

    public static void addMoreRounds() { // function use to add more rounds
        JOptionPane panel = new JOptionPane();
        panel.showMessageDialog(null, "Are You Add More Game");
        String userInput = JOptionPane.showInputDialog("If Yes so please Press 1 & If No so please Press 2 ");
        int opt = Integer.parseInt(userInput);  // otp use to  user input
        int attempt = 0;
        Main.attempts = attempt;
        updateLabels();
        if (opt == 1) {

            guessingNumber();
        } else if (opt == 2) {
            panel.showMessageDialog(null, "Thank You For Gaming");
            System.exit(0);

        }
    }
}
