package aut;

import javax.swing.*;
import java.awt.*;

public class ProgramFrame
{
    private JFrame mainFrame ;

    public ProgramFrame ()
    {
        mainFrame = new JFrame("Java Download Manager");
        //mainFrame.setLocationRelativeTo(null);
        mainFrame.setPreferredSize(null);
        JPanel framePanel = new JPanel();
        framePanel.setLayout(new BorderLayout());
        mainFrame.setContentPane(framePanel);

        Panel toolbarAndMenu = new Panel();
        toolbarAndMenu.setLayout(new BorderLayout());
        framePanel.add(toolbarAndMenu , BorderLayout.NORTH) ;

        ToolbarPanel toolBar = new ToolbarPanel();
        toolbarAndMenu.add(toolBar.getToolbarPanel() ,BorderLayout.CENTER);

        MenubarPanel menuBar = new MenubarPanel();
        toolbarAndMenu.add(menuBar.getMenuPanel() , BorderLayout.NORTH);

        mainFrame.pack();
    }

    public void showFrame ()
    {
        mainFrame.setVisible(true);
    }
}
