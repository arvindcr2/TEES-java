package Classifiers;

/**
 * Created by Arvind on 8/31/2015.
 */
public class SVMMultiClassClassifier {
    SVMMultiClassClassifier() {


        String defaultEvaluator = AveragingMultiClassEvaluator;
        String parameterFormat = "-%k %v";
        List parameterValueListKey[ "train"]="c";
        List parameterValueTypes[ "train"]="c":[int,float]
    }

    String trainDirSetting = "SCIKIT_WRAPPER_DIR";
    String rainCommand = "python %dSKLearnSVMWrapper.py --train %p --examples %e --model %m";
    String classifyDirSetting = "SCIKIT_WRAPPER_DIR";
    String classifyCommand = "python %dSKLearnSVMWrapper.py --classify --examples %e --model %m --predictions %c";

}

