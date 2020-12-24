package com.javaSwing;

import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;

public class App implements ActionListener {

    private static JPanel panel;
    private static JFrame frame;
    private static JLabel label, label1;
    private static JButton button;


    public static void main(String[] args){

        panel = new JPanel();
        frame = new JFrame();

        frame.setSize(100,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Le Saviez-vous?");
        frame.setFont(Font.getFont("Comic Sans MS"));

        frame.add(panel);
        panel.setLayout(null);
        panel.setBackground(Color.orange);


        label = new JLabel("Le Saviez-vous?");

        label.setBounds(10,50,200,25);

        label.setFont(new Font("Comic Sans MS",Font.PLAIN,19));
        panel.add(label);


        /*JTextField userText = new JTextField();
        userText.setBounds(100,20,164,23);
        frame.setVisible(true);*/


        label1 = new JLabel("La bière ne fait pas prendre du ventre");
        label1.setBounds(10, 300, 900, 50);
        panel.add(label1);
        label1.setFont(new Font("Comic Sans MS",Font.PLAIN,19));
        label1.setForeground(Color.WHITE);

        button = new JButton("MONTRER UN AUTRE FAIT");
        button.setBounds(29,500,700,50);

        button.addActionListener(new App());
        panel.add(button);

        frame.setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

        ArrayList<String> quotes = new ArrayList<>();
        quotes.add("Etre amoureux vous rend fainéant");





        int indx = (int) (Math.random()* (quotes.size()  - 1) + 0);
        Random color = new Random();



        float red = color.nextFloat();
        float green = color.nextFloat();
        float blue = color.nextFloat();

        Color randomColor = new Color(red, green, blue);
        panel.setBackground(randomColor);
        button.setForeground(randomColor);

        label1.setText(quotes.get(indx));

    }
}
