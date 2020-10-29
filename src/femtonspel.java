import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Salem Koldzo
 * Date: 2020-10-28
 * Time: 11:14
 * Project: PACKAGE_NAME
 * Copyright: MIT
 */

public class femtonspel extends JFrame implements ActionListener {

    JPanel spelPanel = new JPanel();
    JPanel knappPanel = new JPanel();
    JPanel top = new JPanel();
    int raderLängden = 4;
    int raderBredden = 4;
    JButton[][] spelKnappar = new JButton[raderLängden][raderBredden];
    JLabel positionOgiltig = new JLabel();
    JLabel vinstLabel = new JLabel();
    JButton nyttSpel = new JButton("Nytt spel");
    JButton vinstOnDemand = new JButton("Vinst ON Demand");
    Color ColorSpelKnapp = new Color(0,128,128);
    Color ColorBlank = new Color(127,255,212);
    Color textColor = new Color(255,255,240);


    public femtonspel(){
        //Inställningar för panel
        setSize(520, 510);
        setMinimumSize(new Dimension(520, 510));
        setTitle("Femtonspelet");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Top
        add(top, BorderLayout.NORTH);
        top.setPreferredSize(new Dimension(35, 35));
        top.setBackground(Color.WHITE);
        positionOgiltig.setText("Ogiltigt val");
        vinstLabel.setText("Grattis! Du har vunnit!");
        top.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        positionOgiltig.setFont(new Font("Arial", Font.BOLD, 20));
        vinstLabel.setFont(new Font("Arial", Font.BOLD, 20));

        //spelPanel
        add(spelPanel, BorderLayout.CENTER);
        spelPanel.setSize(400, 400);
        spelPanel.setLayout(new GridLayout(raderLängden, raderBredden));
        spelPanel.removeAll();

        //Skapa knapparna
        for (int radNr = 0; radNr < raderLängden; radNr++){
            for (int kolumnNr = 0; kolumnNr < raderBredden; kolumnNr++){
                spelKnappar[radNr][kolumnNr] = new JButton();
                spelKnappar[radNr][kolumnNr].addActionListener(this);
                spelPanel.add(spelKnappar[radNr][kolumnNr]);
                spelKnappar[radNr][kolumnNr].setForeground(textColor);
                spelKnappar[radNr][kolumnNr].setFont(new Font("Arial", Font.BOLD, 40));
            }
        }
        spelPanel.repaint();


        //knappPanel
        add(knappPanel, BorderLayout.SOUTH);
        knappPanel.add(nyttSpel);
        nyttSpel.addActionListener(this);
        knappPanel.add(vinstOnDemand);
        vinstOnDemand.addActionListener(this);

        //Blanda knapparna
        //blandaSpelKnapparna();

    }










    public static void main(String[] args) {
        new femtonspel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}