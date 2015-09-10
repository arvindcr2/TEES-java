package Utils.Connection;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;


public class UnixConnection{

    Path workdir = null;
    String account;
    String settings=null;
    String memory=null;
    String cores=null;
    String jobLimit=null;
    String killGroup=null;
    String preamble=null;
    boolean debug=false;
    boolean compression=false;
    public void UnixConnection(String account, String settings, String memory, String cores, String jobLimit, String killGroup, String premble, boolean debug)
    {
    account = account;
    settings = settings;
    memory = memory;
    cores = cores;
    jobLimit = jobLimit;
    killGroup = killGroup;
    preamble = preamble;
    debug = debug;
    }

    public String download(String src, String dst, boolean replace, boolean compress, boolean uncompress)
    {
        if(src.contains(":"))
        {
        String srcAccount= src.split(":")[0];
        if (srcAccount != account) throw new AssertionError();
        }
        else
        {
            src = this.getRemotePath(src, false);
        }
        if(dst==null)
        {
            dst = src;
            dst=this.getLocalPath(dst);

        }
        assert (!dst.contains(":"));
        if(this.account==null)
        {
            return dst;
        }
        if(replace==false && new File(dst).exists())
        {
            return dst;
        }
        else
        {
            if((this.compression || uncompress)&& !src.endsWith(".gz"){
            System.out.println("Compressing "+src+": ");
            try {
                Process exec = Runtime.getRuntime().exec("dir");
                exec.waitFor();
                System.out.println(exec.getOutputStream());

            } catch (Exception e) {
                e.printStackTrace();
            }

        }}
    }
    public String getRemotePath(String path,boolean addAccount){
    if(this.workdir!=null)
    {
        path = Paths.get(this.workdir+"/"+path.split(":")[-1]).toString();
    }
    if(addAccount && (this.account!=null))
    {
        path = this.account+":"+path;
    }
     return path;
    }

    public String getLocalPath(String path){
    String localPath = Paths.get(path.split(":")[-1]).toString();
    if((this.workdir!=null) && localPath.startsWith(this.workdir.toString()))
    {
        localPath = Paths.get("/"+ localPath.substring(this.workdir.toString().length(),localPath.length())).toString();
    }
        return localPath;
    }
}

