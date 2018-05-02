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
        mainFrame = new JFrame("Java Download Manager");
        //mainFrame.setLocationRelativeTo(null);
        mainFrame.setPreferredSize(null);
        JPanel framePanel = new JPanel();
        framePanel.setLayout(new BorderLayout());
        mainFrame.setContentPane(framePanel);

        JPanel toolbarAndMenu = new JPanel();
        toolbarAndMenu.setLayout(new BorderLayout());
        framePanel.add(toolbarAndMenu , BorderLayout.NORTH) ;

        ToolbarPanel toolBar = new ToolbarPanel();
        width = toolBar.getToolbarPanel().getPreferredSize() ;
        toolbarAndMenu.add(toolBar.getToolbarPanel() ,BorderLayout.CENTER);

        MenubarPanel menuBar = new MenubarPanel();
        toolbarAndMenu.add(menuBar.getMenuPanel() , BorderLayout.NORTH);

        middlePanel = new MiddlePanel(toolBar);

        framePanel.add(middlePanel.getMiddlePanel(),BorderLayout.CENTER);
        mainFrame.pack();
    }

    public static void addNew (JPanel newDownload)
    {
        middlePanel.getMiddlePanel().add(newDownload);
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
