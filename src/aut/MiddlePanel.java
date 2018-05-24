package aut;

import javax.swing.*;
import java.awt.*;


public class MiddlePanel
{
    private JScrollPane middlePanel ;
    private static DefaultListModel downloads;
    private JList<DownloadPanel> list;

    public MiddlePanel()
    {
        downloads = new DefaultListModel();
        list = new JList<>(downloads);

        ListCellRenderer renderer = new DownloadPanel();
        list.setCellRenderer(renderer);

        middlePanel = new JScrollPane(list);

        middlePanel.setBackground(Color.GRAY);
        

    }

    public JScrollPane getMiddlePanel() {
        return middlePanel;
    }

    public static void addNewDownload (NewDownload newDownload)
    {
        downloads.addElement(newDownload);
    }

}
