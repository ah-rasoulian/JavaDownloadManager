package aut;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MiddlePanel
{
    private JScrollPane middlePanel ;
    private DefaultListModel downloadPanels;
    private JList<DownloadPanel> list;

    public MiddlePanel()
    {
        downloadPanels = new DefaultListModel();
        list = new JList<>(downloadPanels);
        
        middlePanel = new JScrollPane(list);

        middlePanel.setBackground(Color.GRAY);
        

    }

    public JScrollPane getMiddlePanel() {
        return middlePanel;
    }

    public void addNewPanel (DownloadPanel downloadPanel)
    {
        downloadPanels.addElement(downloadPanel);
    }
}
