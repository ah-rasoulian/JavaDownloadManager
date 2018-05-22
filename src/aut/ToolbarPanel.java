package aut;

import javax.swing.*;
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
        BoxLayout layout = new BoxLayout(toolbarPanel , BoxLayout.X_AXIS);
        toolbarPanel.setLayout(layout);
        toolbarPanel.setPreferredSize(new Dimension(0 , 50));

        ImageIcon newIcon = new ImageIcon("\\Users\\AHR96\\Desktop\\JavaDownloadManager\\Icons\\add.png");
        newDownload = new JButton(newIcon);
        newDownload.setBackground(Color.white);
        newDownload.addActionListener(handleActions);

        ImageIcon pauseIcon = new ImageIcon("\\Users\\AHR96\\Desktop\\JavaDownloadManager\\Icons\\pause.png");
        JButton pause = new JButton(pauseIcon);
        pause.setBackground(Color.white);

        ImageIcon resumeIcon = new ImageIcon("\\Users\\AHR96\\Desktop\\JavaDownloadManager\\Icons\\play.png");
        JButton resume = new JButton(resumeIcon);
        resume.setBackground(Color.white);

        ImageIcon cancelIcon = new ImageIcon("\\Users\\AHR96\\Desktop\\JavaDownloadManager\\Icons\\remove.png");
        JButton cancel = new JButton(cancelIcon);
        cancel.setBackground(Color.white);

        ImageIcon removeIcon = new ImageIcon("\\Users\\AHR96\\Desktop\\JavaDownloadManager\\Icons\\taskcleaner.png");
        JButton remove = new JButton(removeIcon);
        remove.setBackground(Color.white);

        ImageIcon settingIcon = new ImageIcon("\\Users\\AHR96\\Desktop\\JavaDownloadManager\\Icons\\settings.png");
        JButton setting = new JButton(settingIcon);
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
