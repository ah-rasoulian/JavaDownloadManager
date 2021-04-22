package aut;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class LeftPanel extends JPanel
{
    private JButton processing;
    private JButton completed ;
    private JButton queues;
    private JButton default1;
    private BufferedImage image;

    public LeftPanel ()
    {
        SpringLayout layout = new SpringLayout();
        this.setLayout(layout);
        this.setBackground(Color.DARK_GRAY);
        try {
            image = ImageIO.read(new File("/home/amirhossein/Data/University/Advanced Programming/JavaDownloadManager/Icons/logo.png"));
        } catch (IOException e) {
            System.out.println("vay");
            e.printStackTrace();
        }

        processing = new JButton("Processing");
        processing.setPreferredSize(new Dimension(265 , 40));
        processing.setBackground(Color.DARK_GRAY);
        processing.setForeground(Color.WHITE);
        ImageIcon processingIcon = new ImageIcon("/home/amirhossein/Data/University/Advanced Programming/JavaDownloadManager/Icons/processing.png");
        processing.setIcon(processingIcon);

        completed = new JButton("Completed");
        completed.setPreferredSize(new Dimension(265,40));
        completed.setBackground(Color.DARK_GRAY);
        completed.setForeground(Color.WHITE);
        ImageIcon completedIcon = new ImageIcon("/home/amirhossein/Data/University/Advanced Programming/JavaDownloadManager/Icons/completed.png");
        completed.setIcon(completedIcon);

        queues = new JButton("Queues") ;
        queues.setPreferredSize(new Dimension(265,40));
        queues.setBackground(Color.DARK_GRAY);
        queues.setForeground(Color.WHITE);
        ImageIcon queuesIcon = new ImageIcon("/home/amirhossein/Data/University/Advanced Programming/JavaDownloadManager/Icons/queue.png");
        queues.setIcon(queuesIcon);

        default1 = new JButton("Default") ;
        default1.setPreferredSize(new Dimension(265,40));
        default1.setBackground(Color.DARK_GRAY);
        default1.setForeground(Color.WHITE);


        this.add(processing);
        this.add(completed);
        this.add(queues);
        this.add(default1);

        layout.putConstraint(SpringLayout.NORTH , processing , 153 , SpringLayout.NORTH , this);
        layout.putConstraint(SpringLayout.NORTH, completed , 0 , SpringLayout.SOUTH , processing);
        layout.putConstraint(SpringLayout.NORTH , queues , 0 ,SpringLayout.SOUTH , completed);
        layout.putConstraint(SpringLayout.NORTH ,default1 , 0 , SpringLayout.SOUTH , queues);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }
}
