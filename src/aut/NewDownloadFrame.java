package aut;

import javax.swing.*;
import java.awt.*;

public class NewDownloadFrame
{
    JFrame newDownloadFrame ;
    public NewDownloadFrame ()
    {
        newDownloadFrame = new JFrame("New Download");
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
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
        JButton ok = new JButton("OK");
        JButton cancel = new JButton("Cancel");

        bottomOfPanel.add(ok);
        bottomOfPanel.add(cancel);

        mainPanel.add(topOfPanel,BorderLayout.NORTH);
        mainPanel.add(bottomOfPanel,BorderLayout.SOUTH);

        newDownloadFrame.pack();
    }

    public void showFrame ()
    {
        newDownloadFrame.setVisible(true);
    }
}
