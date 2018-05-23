package aut;

import javax.swing.*;
import java.awt.*;

public class ProgramFrame
{
    private JFrame mainFrame ;
    private static MiddlePanel middlePanel;
    private static Dimension width;

    public ProgramFrame ()
    {
        JFrame.setDefaultLookAndFeelDecorated(true);

        mainFrame = new JFrame("Java Download Manager");
        //mainFrame.setLocationRelativeTo(null);
//        mainFrame.setPreferredSize(null);
        mainFrame.setSize(800 , 500);

        JPanel framePanel = new JPanel();
        framePanel.setLayout(new BorderLayout());
        mainFrame.setContentPane(framePanel);

        ToolbarPanel toolBar = new ToolbarPanel();
        width = toolBar.getToolbarPanel().getPreferredSize() ;

        MenubarPanel menuBar = new MenubarPanel();
        framePanel.add(menuBar.getMenuPanel() , BorderLayout.NORTH) ;

        middlePanel = new MiddlePanel();
        JPanel rightPanel = new JPanel(new BorderLayout());
        rightPanel.add(toolBar.getToolbarPanel() , BorderLayout.NORTH);
        rightPanel.add(middlePanel.getMiddlePanel() , BorderLayout.CENTER);

        framePanel.add(rightPanel,BorderLayout.CENTER);

        LeftPanel leftPanel = new LeftPanel();
        framePanel.add(leftPanel,BorderLayout.WEST);
        leftPanel.setPreferredSize(new Dimension(265 , 0));


    }

    public static void addNew (DownloadPanel newDownload)
    {
        middlePanel.addNewPanel(newDownload);
        middlePanel.getMiddlePanel().revalidate();
        middlePanel.getMiddlePanel().repaint();
    }

    public void showFrame ()
    {
        mainFrame.setVisible(true);
    }

    public static Dimension getWidth() {
        return width;
    }
}
