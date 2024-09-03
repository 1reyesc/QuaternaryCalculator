package src.gui;

import jdk.jfr.Event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.HashMap;

public class Gui implements ActionListener{

    ArrayList<JButton> buttons = new ArrayList<>();
    JFrame frame = new JFrame();

    JTextField text = new JTextField();



    public Gui(){
        makeButtons();

        text.setBounds(0,0,500,100);
        frame.add(text);

        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }


    void makeButtons(){
        String[][] buttonText = {
                {"0", "1", "+",},
                {"2", "3", "-",},
                {"*", "/", "=",},
                {"x²", "₂/x","dec"}
        };
        int[] x = {0,150,300}, y = {100, 180, 260, 340};
        for(int o=0;o<buttonText.length;o++){
            for(int i=0;i<buttonText[o].length;i++){
                JButton button = new JButton(buttonText[o][i]);
                button.setBounds(x[i],y[o],150,80);
                button.addActionListener(this);

                buttons.add(button);
                frame.add(button);

            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(JButton b: buttons){
            if(b==e.getSource()){
                switch (b.getText()){
                    default:
                        text.setText(text.getText()+b.getText());
                }
            }
        }

    }
}
