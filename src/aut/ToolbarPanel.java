package aut;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolbarPanel
{
    private Panel toolbarPanel;
    private JButton newDownload;

    public ToolbarPanel ()
    {
        HandleActions handleActions = new HandleActions();

        toolbarPanel = new Panel();

        toolbarPanel.setLayout(new GridLayout());

        ImageIcon newIcon = new ImageIcon("\\Users\\AHR96\\Desktop\\JavaDownloadManager\\Icons\\new.png");
        newDownload = new JButton("New Download",newIcon);
        newDownload.setBackground(Color.white);
        newDownload.addActionListener(handleActions);

        ImageIcon pauseIcon = new ImageIcon("\\Users\\AHR96\\Desktop\\JavaDownloadManager\\Icons\\pause.png");
        JButton pause = new JButton("Pause",pauseIcon);
        pause.setBackground(Color.white);

        ImageIcon resumeIcon = new ImageIcon("\\Users\\AHR96\\Desktop\\JavaDownloadManager\\Icons\\resume.png");
        JButton resume = new JButton("Resume",resumeIcon);
        resume.setBackground(Color.white);

        ImageIcon cancelIcon = new ImageIcon("\\Users\\AHR96\\Desktop\\JavaDownloadManager\\Icons\\cancel.png");
        JButton cancel = new JButton("Cancel",cancelIcon);
        cancel.setBackground(Color.white);

        ImageIcon removeIcon = new ImageIcon("\\Users\\AHR96\\Desktop\\JavaDownloadManager\\Icons\\remove.png");
        JButton remove = new JButton("Remove",removeIcon);
        remove.setBackground(Color.white);

        ImageIcon settingIcon = new ImageIcon("\\Users\\AHR96\\Desktop\\JavaDownloadManager\\Icons\\setting.png");
        JButton setting = new JButton("Setting",settingIcon);
        setting.setBackground(Color.white);

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

    private class HandleActions implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(newDownload))
            {
                NewDownloadFrame newDownload = new NewDownloadFrame();
                newDownload.showFrame();
            }
        }
    }
}
