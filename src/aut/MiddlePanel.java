package aut;

import javax.swing.*;
import java.awt.*;

public class MiddlePanel
{
    private JPanel middlePanel ;

    public MiddlePanel()
    {
        middlePanel = new JPanel();
        middlePanel.setLayout(new BoxLayout(middlePanel , BoxLayout.Y_AXIS));

        middlePanel.setPreferredSize(new Dimension(ProgramFrame.getWidth().width,500));
        middlePanel.setBackground(Color.GRAY);
        

    }

    public JPanel getMiddlePanel() {
        return middlePanel;
    }

}
