package aut;

import javax.swing.*;
import java.awt.*;

public class MiddlePanel
{
    private JPanel middlePanel ;

    public MiddlePanel()
    {
        middlePanel = new JPanel();
        middlePanel.setLayout(new GridLayout(10,1));

        middlePanel.setPreferredSize(new Dimension(ProgramFrame.getWidth().width,500));
        middlePanel.setBackground(Color.yellow);

    }

    public JPanel getMiddlePanel() {
        return middlePanel;
    }

}
