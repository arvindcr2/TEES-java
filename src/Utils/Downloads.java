package Utils;

import java.nio.file.Path;

public class Downloads {
    public static void DownloadAndExtract(String url, Path extractPath, Path downloadPath, Path packagePath, boolean addName, boolean redownload) {

    String downloadFile = download(url, extractPath, addName, redownload);
    }

    private static String download(String url, Path extractPath, boolean addName, boolean redownload) {
    }
}