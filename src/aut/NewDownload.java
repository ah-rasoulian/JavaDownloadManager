package aut;

public class NewDownload
{
    public NewDownload (String url , String saveAdress)
    {
        DownloadPanel downloadPanel = new DownloadPanel(url ,100,20);
        ProgramFrame.addNew( downloadPanel );
    }

}
