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

        JPanel panel = (JPanel) value;
        return panel;
    }
}
