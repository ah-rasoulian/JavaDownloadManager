package aut;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MenubarPanel
{
    private JMenuBar menuBar ;
    private JMenuItem newDownLoad ;
    private JMenuItem pause ;
    private JMenuItem resume ;
    private JMenuItem cancel ;
    private JMenuItem remove ;
    private JMenuItem setting ;
    private JMenuItem exit ;

    public MenubarPanel ()
    {
        HandleActions handleActions = new HandleActions();

        menuBar = new JMenuBar();

        JMenu download = new JMenu("Download");
        //download.setMnemonic(KeyEvent.VK_T);
        //download.getAccessibleContext().setAccessibleDescription("asd");

        newDownLoad = new JMenuItem("New Download  ",KeyEvent.VK_N);
        KeyStroke controlN = KeyStroke.getKeyStroke("control N");
        newDownLoad.setAccelerator(controlN);
        newDownLoad.addActionListener(handleActions);

        pause = new JMenuItem("Pause");
        KeyStroke controlP = KeyStroke.getKeyStroke("control P");
        pause.setAccelerator(controlP);
        pause.addActionListener(handleActions);

        resume = new JMenuItem("Resume");
        KeyStroke controlR = KeyStroke.getKeyStroke("control R");
        resume.setAccelerator(controlR);
        resume.addActionListener(handleActions);

        cancel = new JMenuItem("Cancel");
        KeyStroke controlC = KeyStroke.getKeyStroke("control C");
        cancel.setAccelerator(controlC);
        cancel.addActionListener(handleActions);

        remove = new JMenuItem("Remove");
        KeyStroke controlD = KeyStroke.getKeyStroke("control D");
        remove.setAccelerator(controlD);
        remove.addActionListener(handleActions);

        setting = new JMenuItem("Setting");
        KeyStroke controlS = KeyStroke.getKeyStroke("control S");
        setting.setAccelerator(controlS);
        setting.addActionListener(handleActions);

        exit = new JMenuItem("Exit");
        KeyStroke controlE = KeyStroke.getKeyStroke("control E");
        exit.setAccelerator(controlE);
        exit.addActionListener(handleActions);

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
    private class HandleActions implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(newDownLoad))
            {
                NewDownloadFrame newDownload = new NewDownloadFrame();
                newDownload.showFrame();
            }
            if(e.getSource().equals(pause))
            {

            }
            if(e.getSource().equals(resume))
            {

            }
            if(e.getSource().equals(remove))
            {

            }
            if(e.getSource().equals(cancel))
            {

            }
            if(e.getSource().equals(setting))
            {

            }
            if(e.getSource().equals(exit))
            {

            }
        }
    }
}
