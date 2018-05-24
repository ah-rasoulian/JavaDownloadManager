package aut;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.io.File;
import java.net.URL;

public class NewDownload extends JPanel
{
    private URL url;
    private File saveAddress ;
    private long byteDownloaded;
    private long wholeBytes ;
    private long rate ;

    public NewDownload (String url , String saveAddress)
    {
        this.url = null ;
        this.saveAddress = null ;
        this.byteDownloaded = 20 ;
        this.wholeBytes = 100 ;
        this.rate = 100 ;

        Integer percentDownloaded = (int)( byteDownloaded*100 / wholeBytes );

        Border border = BorderFactory.createLineBorder(Color.BLACK , 3);
        this.setBorder(border);
        this.setPreferredSize(new Dimension(0,60));
        this.setBackground(Color.WHITE);
        SpringLayout layout = new SpringLayout();
        this.setLayout(layout);

        JLabel dlIcon = new JLabel( new ImageIcon("\\Users\\AHR96\\Desktop\\JavaDownloadManager\\Icons\\dlIcon.png") );
        JLabel nameOfFile = new JLabel(url);
        JLabel percentDl = new JLabel(percentDownloaded.toString() + "%");
        JLabel dlString = new JLabel(downloadedBytesString(byteDownloaded , wholeBytes));
        JLabel rtString = new JLabel(rateString(rate));

        JProgressBar progressBar = new JProgressBar();
        progressBar.setValue( percentDownloaded );
        progressBar.setPreferredSize(new Dimension(420 , 10));

        this.add(nameOfFile);
        this.add(progressBar);
        this.add(dlIcon);
        this.add(percentDl);
        this.add(dlString);
        this.add(rtString);

        layout.putConstraint(SpringLayout.WEST , dlIcon , 10 ,SpringLayout.WEST , this);
        layout.putConstraint(SpringLayout.NORTH , dlIcon, 10 , SpringLayout.NORTH , this);
        layout.putConstraint(SpringLayout.WEST , nameOfFile , 40 ,SpringLayout.WEST , this);
        layout.putConstraint(SpringLayout.NORTH , nameOfFile , 5 , SpringLayout.NORTH , this);
        layout.putConstraint(SpringLayout.WEST , progressBar, 40 , SpringLayout.WEST , this);
        layout.putConstraint(SpringLayout.NORTH , progressBar , 20, SpringLayout.NORTH , this);
        layout.putConstraint(SpringLayout.NORTH , percentDl , 17, SpringLayout.NORTH , this);
        layout.putConstraint(SpringLayout.WEST , percentDl , 10 , SpringLayout.EAST , progressBar);
        layout.putConstraint(SpringLayout.NORTH , dlString , 5, SpringLayout.SOUTH , progressBar);
        layout.putConstraint(SpringLayout.EAST , dlString , 10 , SpringLayout.EAST ,progressBar);
        layout.putConstraint(SpringLayout.NORTH , rtString , 5, SpringLayout.SOUTH , progressBar);
        layout.putConstraint(SpringLayout.WEST , rtString , 10 , SpringLayout.WEST ,progressBar);

    }

    public String downloadedBytesString (long byteDownloaded , long wholeBytes)
    {
        return "20Mg/100Mg";
    }
    public String rateString (long rate)
    {
        return "30Kb /sec" ;
    }
}
