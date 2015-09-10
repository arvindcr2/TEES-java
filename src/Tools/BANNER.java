package Tools;

import Utils.Downloads;
import Utils.Settings;

import java.nio.file.Path;
import java.io.File;
import java.nio.file.Paths;


public class BANNER {
    public boolean test(Path dir) {
        return true;
    }
    public static String combine (String path1, String path2)
    {
        File file1 = new File(path1);
        File file2 = new File(file1, path2);
        return file2.getPath();
    }


    public void install(Path destDir, Path downloadDir, boolean redownload, boolean compile, Path javaHome, boolean updateLocalSettings )
    {
    System.out.println("Installing BANNER..");

    if (downloadDir == null){
        downloadDir = Paths.get(combine(Settings.DATAPATH, "tools/download"));
    }
    if (destDir==null){
        destDir = Paths.get(Settings.DATAPATH);
    }
    if (compile)
    {
        Downloads.DownloadAndExtract()
    }


    }

    makeConfigXML()

    makeEntityElements()

    getWhiteSpaceLessStringMap()

    fixWhiteSpaceLessOffset()

    fixOffsetOld()

    run()
};