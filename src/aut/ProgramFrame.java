package aut;

import javax.swing.*;

public class ProgramFrame
{
    private JFrame mainFrame ;

    public ProgramFrame ()
    {
        mainFrame = new JFrame("JDM");
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setPreferredSize(null);
        JPanel framePanel = new JPanel();
        mainFrame.setContentPane(framePanel);

        ToolbarPanel toolBar = new ToolbarPanel();

        MenubarPanel menuBar = new MenubarPanel();

        framePanel.add(toolBar.getToolbarPanel());
        framePanel.add(menuBar.getMenuPanel());

    }

    public void showFrame ()
    {
        mainFrame.setVisible(true);
    }
}
