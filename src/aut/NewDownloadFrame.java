package aut;

import javax.swing.*;
import java.awt.*;

public class NewDownloadFrame
{
    JFrame newDownloadFrame ;
    public NewDownloadFrame ()
    {
        newDownloadFrame = new JFrame("New Download");
        newDownloadFrame.setLocationRelativeTo(null);
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3,1));
        newDownloadFrame.setContentPane(mainPanel);

        JPanel topOfPanel = new JPanel();
        topOfPanel.setLayout(new GridLayout(2,2));
        JLabel urlName = new JLabel("URL Address");
        JTextField urlAddress = new JTextField("URL:");
        JLabel saveAdressName = new JLabel("Save Location");
        JTextField saveAddress = new JTextField("Save Location");
        topOfPanel.add(urlName);
        topOfPanel.add(urlAddress);
        topOfPanel.add(saveAdressName);
        topOfPanel.add(saveAddress);

        JPanel bottomOfPanel = new JPanel();
        SpringLayout bottomLayout = new SpringLayout();
        bottomOfPanel.setLayout(bottomLayout);
        JButton ok = new JButton("OK");
        JButton cancel = new JButton("Cancel");

        bottomLayout.putConstraint(SpringLayout.EAST,bottomOfPanel , 10 , SpringLayout.EAST , cancel);
        bottomLayout.putConstraint(SpringLayout.WEST,cancel , 10 , SpringLayout.EAST , ok);

        bottomOfPanel.add(ok);
        bottomOfPanel.add(cancel);

        JPanel middleOfPanel = new JPanel();


        mainPanel.add(topOfPanel);
        mainPanel.add(middleOfPanel);
        mainPanel.add(bottomOfPanel);

        newDownloadFrame.pack();
    }

    public void showFrame ()
    {
        newDownloadFrame.setVisible(true);
    }
}
