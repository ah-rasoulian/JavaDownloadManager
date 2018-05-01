package aut;

import javax.swing.*;
import java.awt.*;

public class MiddlePanel
{
    JPanel middlePanel ;

    public MiddlePanel(ToolbarPanel toolbarPanel)
    {
        middlePanel = new JPanel();
        middlePanel.setPreferredSize(new Dimension(toolbarPanel.getToolbarPanel().getPreferredSize().width,500));
        middlePanel.setBackground(Color.yellow);

    }

    public JPanel getMiddlePanel() {
        return middlePanel;
    }
}
