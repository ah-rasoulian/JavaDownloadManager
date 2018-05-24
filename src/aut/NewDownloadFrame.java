package aut;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


public class NewDownloadFrame
{
    private JFrame newDownloadFrame ;
    private JButton ok;
    private JTextField urlAddress;
    private JButton saveAddress;
    private JTextField saveAdressTextFiled;
    private JButton cancel;

    public NewDownloadFrame ()
    {
        HandleActions handleActions = new HandleActions();

        newDownloadFrame = new JFrame("New Download");
        newDownloadFrame.setLocationRelativeTo(null);
        newDownloadFrame.setMinimumSize(new Dimension(350 , 200));
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.Y_AXIS));
        newDownloadFrame.setContentPane(mainPanel);

        JPanel topOfPanel = new JPanel();
        SpringLayout topLayout = new SpringLayout();
        topOfPanel.setLayout(topLayout);
        JLabel urlName = new JLabel("URL Address");
        urlAddress = new JTextField();
        urlAddress.setPreferredSize(new Dimension(230 , 20));
        JLabel saveAddressName = new JLabel("Save Location");
        saveAddress = new JButton();
        ImageIcon saveAddressIcon = new ImageIcon("\\Users\\AHR96\\Desktop\\JavaDownloadManager\\Icons\\fileChooser.png");
        saveAddress.setIcon(saveAddressIcon);
        saveAddress.setPreferredSize(new Dimension(20 , 20));
        saveAddress.setBackground(Color.GRAY);
        saveAddress.addActionListener(handleActions);
        saveAdressTextFiled = new JTextField();
        saveAdressTextFiled.setPreferredSize(new Dimension(210,20));

        topOfPanel.add(urlName);
        topOfPanel.add(urlAddress);
        topOfPanel.add(saveAddressName);
        topOfPanel.add(saveAddress);
        topOfPanel.add(saveAdressTextFiled);
        topLayout.putConstraint(SpringLayout.WEST , urlName , 10 , SpringLayout.WEST , topOfPanel);
        topLayout.putConstraint(SpringLayout.EAST , urlAddress , 0 , SpringLayout.EAST , topOfPanel);
        topLayout.putConstraint(SpringLayout.WEST , saveAddressName , 10 , SpringLayout.WEST , topOfPanel);
        topLayout.putConstraint(SpringLayout.NORTH , saveAddressName , 10 , SpringLayout.SOUTH , urlName);
        topLayout.putConstraint(SpringLayout.EAST , saveAddress , 0 , SpringLayout.EAST , topOfPanel);
        topLayout.putConstraint(SpringLayout.NORTH , saveAddress , 5 ,SpringLayout.SOUTH , urlAddress);
        topLayout.putConstraint(SpringLayout.EAST , saveAdressTextFiled , 0 , SpringLayout.WEST , saveAddress);
        topLayout.putConstraint(SpringLayout.NORTH , saveAdressTextFiled , 5 ,SpringLayout.SOUTH , urlAddress);


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
                ProgramFrame.addNew(newDownload);
                newDownloadFrame.setVisible(false);
            }
            if ( e.getSource().equals(cancel))
                newDownloadFrame.setVisible(false);
            if (e.getSource().equals(saveAddress))
            {
                JFileChooser savingLocation = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
                int returnValue = savingLocation.showSaveDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = savingLocation.getSelectedFile();
                    System.out.println(selectedFile.getAbsolutePath());
                }
            }
        }

    }
}
