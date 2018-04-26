package aut;

import javax.swing.*;
import java.awt.*;

public class ToolbarPanel
{
    private Panel toolbarPanel;

    public ToolbarPanel ()
    {
        toolbarPanel = new Panel();

        JButton newDownload = new JButton("New Download");
        JButton pause = new JButton("Pause");
        JButton resume = new JButton("Resume");
        JButton cancel = new JButton("Cancel");
        JButton remove = new JButton("Remove");
        JButton setting = new JButton("Setting");

        toolbarPanel.add(newDownload);
        toolbarPanel.add(resume);
        toolbarPanel.add(pause);
        toolbarPanel.add(cancel);
        toolbarPanel.add(remove);
        toolbarPanel.add(setting);
    }

    public Panel getToolbarPanel() {
        return toolbarPanel;
    }
}
