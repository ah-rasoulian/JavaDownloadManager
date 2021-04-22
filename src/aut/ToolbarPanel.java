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
        toolbarPanel.setBackground(Color.WHITE);

        toolbarPanel.setPreferredSize(new Dimension(0 , 50));

        ImageIcon newIcon = new ImageIcon("/home/amirhossein/Data/University/Advanced Programming/JavaDownloadManager/Icons/add.png");
        newDownload = new JButton(newIcon);
        newDownload.setBackground(Color.WHITE);
        newDownload.addActionListener(handleActions);

        ImageIcon pauseIcon = new ImageIcon("/home/amirhossein/Data/University/Advanced Programming/JavaDownloadManager/Icons/pause.png");
        pause = new JButton(pauseIcon);
        pause.setBackground(Color.WHITE);

        ImageIcon resumeIcon = new ImageIcon("/home/amirhossein/Data/University/Advanced Programming/JavaDownloadManager/Icons/play.png");
        resume = new JButton(resumeIcon);
        resume.setBackground(Color.WHITE);

        ImageIcon cancelIcon = new ImageIcon("/home/amirhossein/Data/University/Advanced Programming/JavaDownloadManager/Icons/remove.png");
        cancel = new JButton(cancelIcon);
        cancel.setBackground(Color.WHITE);

        ImageIcon removeIcon = new ImageIcon("/home/amirhossein/Data/University/Advanced Programming/JavaDownloadManager/Icons/taskcleaner.png");
        remove = new JButton(removeIcon);
        remove.setBackground(Color.WHITE);

        ImageIcon settingIcon = new ImageIcon("/home/amirhossein/Data/University/Advanced Programming/JavaDownloadManager/Icons/settings.png");
        setting = new JButton(settingIcon);
        setting.setBackground(Color.WHITE);

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
