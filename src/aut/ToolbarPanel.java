package aut;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolbarPanel
{
    private Panel toolbarPanel;
    private JButton newDownload;
    private JButton pause;
    private JButton resume;
    private JButton cancel;
    private JButton remove;
    private JButton setting;

    public ToolbarPanel ()
    {
        HandleActions handleActions = new HandleActions();

        toolbarPanel = new Panel();
        BoxLayout layout = new BoxLayout(toolbarPanel , BoxLayout.X_AXIS);
        toolbarPanel.setLayout(layout);
        toolbarPanel.setBackground(Color.CYAN);

        toolbarPanel.setPreferredSize(new Dimension(0 , 50));

        ImageIcon newIcon = new ImageIcon("\\Users\\AHR96\\Desktop\\JavaDownloadManager\\Icons\\add.png");
        newDownload = new JButton(newIcon);
        newDownload.setBackground(Color.CYAN);
        newDownload.addActionListener(handleActions);

        ImageIcon pauseIcon = new ImageIcon("\\Users\\AHR96\\Desktop\\JavaDownloadManager\\Icons\\pause.png");
        pause = new JButton(pauseIcon);
        pause.setBackground(Color.CYAN);

        ImageIcon resumeIcon = new ImageIcon("\\Users\\AHR96\\Desktop\\JavaDownloadManager\\Icons\\play.png");
        resume = new JButton(resumeIcon);
        resume.setBackground(Color.CYAN);

        ImageIcon cancelIcon = new ImageIcon("\\Users\\AHR96\\Desktop\\JavaDownloadManager\\Icons\\remove.png");
        cancel = new JButton(cancelIcon);
        cancel.setBackground(Color.CYAN);

        ImageIcon removeIcon = new ImageIcon("\\Users\\AHR96\\Desktop\\JavaDownloadManager\\Icons\\taskcleaner.png");
        remove = new JButton(removeIcon);
        remove.setBackground(Color.CYAN);

        ImageIcon settingIcon = new ImageIcon("\\Users\\AHR96\\Desktop\\JavaDownloadManager\\Icons\\settings.png");
        setting = new JButton(settingIcon);
        setting.setBackground(Color.CYAN);

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
