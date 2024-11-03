package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main{
    public static void main(String[] args) {

        //add the main frame
        JFrame frame = new JFrame("Voting System");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Creating an Object to count votes
        VoteUtilities voteCount = new VoteUtilities();

        //Add button
        JPanel panel = new JPanel();
        JButton voteA = new JButton("Vote for Party A");
        JButton voteB = new JButton("Vote for Party B");
        JButton VoteCasted = new JButton("Total votes casted are: " + voteCount.totalVotes);

        //Adding panels
        panel.add(voteA);
        panel.add(voteB);
        panel.add(VoteCasted);
        frame.add(panel);

        //Action after Pressing Button A
        voteA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                voteCount.votePartyA++;
                String message = "Button Clicked! Vote +1 \n Current votes:" + voteCount.votePartyA;
                JOptionPane.showMessageDialog(frame, message);
            }
        });

        //Action after Pressing Button B
        voteB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                voteCount.votePartyB++;
                String message = "Button Clicked! Vote +1 \n Current votes:" + voteCount.votePartyB;
                JOptionPane.showMessageDialog(frame, message);
            }
        });


        //turn on visibility of frame
        frame.setVisible(true);

    }
}
