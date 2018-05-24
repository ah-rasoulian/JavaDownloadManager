package aut;

import javax.swing.*;
import java.awt.*;

public class DownloadPanel implements ListCellRenderer
{

    private DefaultListCellRenderer defaultRenderer ;

    public DownloadPanel ()
    {
        defaultRenderer = new DefaultListCellRenderer();
    }
    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {

        JLabel panel = (JLabel) defaultRenderer.getListCellRendererComponent(list,value,index,isSelected,cellHasFocus);
        System.out.println("slm");
        return panel;
    }
}
