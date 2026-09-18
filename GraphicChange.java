/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package graphicchange;

import javax.swing.*;



public class GraphicChange extends JPanel{
public GraphicChange(){
super();
}


public static void main(String arg[]){
    


JFrame frame = new JFrame("Interactive Text GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);

        JTextField input = new JTextField(20);
        JButton button = new JButton("Submit");
        JLabel output = new JLabel("Enter the monetary amount to recieve the correct change:");

        button.addActionListener(e -> {
             String text = input.getText();
            double change = Double.parseDouble(text);
            int tens = 0;
            int fives = 0;
            int ones = 0;
            double ncents = 0;
            double cents = 0;
            int quarters = 0;
            int dimes = 0;
            int nickels = 0;
            int pennies = 0;

            tens = (int)change / 10;
            fives = (int)change % 10 /5;
            ones = (int)change % 10 % 5;

            cents = change - (int)change;
            ncents = cents * 100 +.0001;

            quarters = (int)ncents / 25;
            dimes = (int)ncents % 25 / 10;
            nickels = (int)ncents % 25 % 10 / 5;
            pennies = (int)ncents % 25 % 10 % 5;
                        output.setText("You typed: " + change);
                        
            output.setText(
                    "<html>" +
                    "Tens: " + tens +
                    "<br>Fives: " + fives +
                    "<br>Ones: " + ones +
                    "<br>Quarters: " + quarters +
                    "<br>Dimes: " + dimes +
                    "<br>Nickels: " + nickels +
                    "<br>Pennies: " + pennies +
                    "</html>"
                );
        });

        JPanel panel = new JPanel();
        panel.add(input);
        panel.add(button);
        panel.add(output);

        frame.add(panel);
        frame.setVisible(true);
    
    
    
}
}