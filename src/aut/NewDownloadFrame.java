package aut;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NewDownloadFrame
{
    private JFrame newDownloadFrame ;
    private JButton ok;
    private JTextField urlAddress;
    private JTextField saveAddress;
    private JButton cancel;

    public NewDownloadFrame ()
    {
        HandleActions handleActions = new HandleActions();

        newDownloadFrame = new JFrame("New Download");
        newDownloadFrame.setLocationRelativeTo(null);
        newDownloadFrame.setMinimumSize(new Dimension(300 , 200));
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3,1));
        newDownloadFrame.setContentPane(mainPanel);

        JPanel topOfPanel = new JPanel();
        SpringLayout topLayout = new SpringLayout();
        topOfPanel.setLayout(topLayout);
        JLabel urlName = new JLabel("URL Address");
        urlAddress = new JTextField();
        urlAddress.setPreferredSize(new Dimension(210 , 20));
        JLabel saveAddressName = new JLabel("Save Location");
        saveAddress = new JTextField();
        saveAddress.setPreferredSize(new Dimension(210 , 20));
        topOfPanel.add(urlName);
        topOfPanel.add(urlAddress);
        topOfPanel.add(saveAddressName);
        topOfPanel.add(saveAddress);
        topLayout.putConstraint(SpringLayout.WEST , urlName , 10 , SpringLayout.WEST , topOfPanel);
        topLayout.putConstraint(SpringLayout.EAST , urlAddress , 20 , SpringLayout.EAST , topOfPanel);
        topLayout.putConstraint(SpringLayout.WEST , saveAddressName , 10 , SpringLayout.WEST , topOfPanel);
        topLayout.putConstraint(SpringLayout.NORTH , saveAddressName , 10 , SpringLayout.SOUTH , urlName);
        topLayout.putConstraint(SpringLayout.EAST , saveAddress , 20 , SpringLayout.EAST , topOfPanel);
        topLayout.putConstraint(SpringLayout.NORTH , saveAddress , 5 ,SpringLayout.SOUTH , urlAddress);

        JPanel bottomOfPanel = new JPanel();
        bottomOfPanel.setLayout(new FlowLayout());

        ok = new JButton("OK");
        ok.addActionListener(handleActions);

        cancel = new JButton("Cancel");
        cancel.addActionListener(handleActions);

        bottomOfPanel.add(ok);
        bottomOfPanel.add(cancel);


        JPanel middleOfPanel = new JPanel();


        mainPanel.add(topOfPanel);
        mainPanel.add(middleOfPanel);
        mainPanel.add(bottomOfPanel);

    }

    public void showFrame ()
    {
        newDownloadFrame.setVisible(true);
    }

    private class HandleActions implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            if ( e.getSource().equals(ok))
            {
                NewDownload newDownload = new NewDownload(urlAddress.getText() , saveAddress.getText());
                newDownloadFrame.setVisible(false);
            }
            if ( e.getSource().equals(cancel))
                newDownloadFrame.setVisible(false);
        }
    }
}
