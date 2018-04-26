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
        
    }

    public void showFrame ()
    {
        mainFrame.setVisible(true);
    }
}
