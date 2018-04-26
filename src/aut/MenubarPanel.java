package aut;

import javax.swing.*;

public class MenubarPanel
{
    private JPanel menuPanel ;

    public MenubarPanel ()
    {
        menuPanel = new JPanel();

        JMenuItem download = new JMenuItem();

        JButton newDownload = new JButton("New Download");
        JButton pause = new JButton("Pause");
        JButton resume = new JButton("Resume");
        JButton cancel = new JButton("Cancel");
        JButton remove = new JButton("Remove");
        JButton setting = new JButton("Setting");

        download.add(newDownload);
        download.add(resume);
        download.add(pause);
        download.add(cancel);
        download.add(remove);
        download.add(setting);

        menuPanel.add(download);
    }

    public JPanel getMenuPanel() {
        return menuPanel;
    }
}
