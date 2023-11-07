package com.game.main;

import com.game.service.GuessNumberGameService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static int current = 0;
    public static int attempts = 0;

    public static int score = 0;
    public static JLabel label;
    public static JLabel label1;

    public static JLabel label2;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Number Guessing Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        label2 = new JLabel("Current Score = "+ score);
        panel.add(label2);
        label = new JLabel("Total Score = " + current);
        panel.add(label);
        label1 = new JLabel("Total Attempts = " + attempts);
        panel.add(label1);

        frame.add(panel, BorderLayout.CENTER);

        JButton startButton = new JButton("Start Game");
        frame.add(startButton, BorderLayout.SOUTH);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                GuessNumberGameService.guessingNumber();
            }
        });

        frame.setVisible(true);
    }
}
