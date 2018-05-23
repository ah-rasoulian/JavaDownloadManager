package aut;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class DownloadPanel extends JPanel
{

    public DownloadPanel (String nameOfFile , Integer volumeOfFile , Integer volumeOfDownloaded)
    {
        this.setPreferredSize(new Dimension(20,20));
        //SpringLayout layout = new SpringLayout();
        //downloadPanel.setLayout(layout);
        this.setLayout(new GridLayout(1,3));
        Border panelBorder = BorderFactory.createLineBorder(Color.BLACK , 5 );
        this.setBorder(panelBorder);

        JProgressBar progressBar = new JProgressBar();
        progressBar.setValue( (volumeOfDownloaded / volumeOfFile) % 100 );
        progressBar.setStringPainted(true);
        progressBar.setPreferredSize(new Dimension( ProgramFrame.getWidth().width / 3 * 2 ,30 ) );

        JLabel label = new JLabel( volumeOfDownloaded.toString() + volumeOfFile.toString() );
        JLabel name = new JLabel(nameOfFile);

        this.add(name);
        this.add(label);
        this.add(progressBar);

//        layout.putConstraint(SpringLayout.NORTH , label , 5 , SpringLayout.SOUTH , progressBar);
//        layout.putConstraint(SpringLayout.EAST , downloadPanel , 5 , SpringLayout.EAST , progressBar);
//        layout.putConstraint(SpringLayout.WEST , downloadPanel , 5 , SpringLayout.WEST , name);
    }

}
