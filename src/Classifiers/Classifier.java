package Classifiers;

/**
 * Created by Arvind on 8/31/2015.
 */

public static removeTempUnzipped(){
        String s=obj.getClass().getName();
        int i=s.lastIndexOf(".");
        if(i>-1)s=s.substring(i+1);
        s=s+".class";
        System.out.println("name "+s);
        Object testPath=this.getClass().getResource(s);
        System.out.println(testPath);
        }
public class Classifier {
    public void optimize(){}
    public void train(){}
    public void savemodel(){}
    public void getUnzipped(){}
    public void getFileCounter(){}
    public void getExampleFile(){}

}
