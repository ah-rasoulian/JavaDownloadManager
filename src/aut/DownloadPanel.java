package aut;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class DownloadPanel
{
    private JPanel downloadPanel ;

    public DownloadPanel (String nameOfFile , Integer volumeOfFile , Integer volumeOfDownloaded)
    {
        downloadPanel = new JPanel();
        //SpringLayout layout = new SpringLayout();
        //downloadPanel.setLayout(layout);
        downloadPanel.setLayout(new GridLayout(1,3));
        Border panelBorder = BorderFactory.createLineBorder(Color.BLACK , 5 );
        downloadPanel.setBorder(panelBorder);

        JProgressBar progressBar = new JProgressBar();
        progressBar.setValue( (volumeOfDownloaded / volumeOfFile) % 100 );
        progressBar.setStringPainted(true);
        progressBar.setPreferredSize(new Dimension( ProgramFrame.getWidth().width / 3 * 2 ,30 ) );

        JLabel label = new JLabel( volumeOfDownloaded.toString() + volumeOfFile.toString() );
        JLabel name = new JLabel(nameOfFile);

        downloadPanel.add(name);
        downloadPanel.add(label);
        downloadPanel.add(progressBar);

//        layout.putConstraint(SpringLayout.NORTH , label , 5 , SpringLayout.SOUTH , progressBar);
//        layout.putConstraint(SpringLayout.EAST , downloadPanel , 5 , SpringLayout.EAST , progressBar);
//        layout.putConstraint(SpringLayout.WEST , downloadPanel , 5 , SpringLayout.WEST , name);
    }

    public JPanel getDownloadPanel() {
        return downloadPanel;
    }
}
