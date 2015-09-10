package Classifiers;

import java.io.File;

/**
 * Created by Arvind on 8/31/2015.
 */
public class AllCorrectClassifier {
    String parameters;
    public AllCorrectClassifier optimize(String parameters){
        AllCorrectClassifier classifier = new AllCorrectClassifier();

        parameters = "TEES.classifier=AllCorrectClassifier";
        classifier.parameters = parameters;
        return classifier;
    }
    public void classify(String output, String examples){
        File output2 = new File(output);
        output2.getAbsolutePath();

        examples.getClass().getSimpleName();

    }
}
