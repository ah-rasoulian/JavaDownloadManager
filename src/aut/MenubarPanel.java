package aut;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class MenubarPanel
{
    private JMenuBar menuBar ;

    public MenubarPanel ()
    {
        menuBar = new JMenuBar();

        JMenu download = new JMenu("Download");
        //download.setMnemonic(KeyEvent.VK_A);
        //download.getAccessibleContext().setAccessibleDescription("asd");

        JMenuItem newDownLoad = new JMenuItem("New Download");
        JMenuItem pause = new JMenuItem("Pause");
        JMenuItem resume = new JMenuItem("Resume");
        JMenuItem cancel = new JMenuItem("Cancel");
        JMenuItem remove = new JMenuItem("Remove");
        JMenuItem setting = new JMenuItem("Setting");
        JMenuItem exit = new JMenuItem("Exit");

        download.add(newDownLoad);
        download.add(resume);
        download.add(pause);
        download.add(cancel);
        download.add(remove);
        download.add(setting);
        download.add(exit);

        JMenu help = new JMenu("Help");

        JMenuItem about = new JMenuItem("About");

        help.add(about);

        menuBar.add(download);
        menuBar.add(help);

    }

    public JMenuBar getMenuPanel() {
        return menuBar ;
    }
}
