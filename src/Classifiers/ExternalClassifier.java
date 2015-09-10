package Classifiers;
import Utils.Connection.UnixConnection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Arvind on 8/31/2015.
 */
public class ExternalClassifier {
public ExternalClassifier(UnixConnection connection)
{
    Object defaultEvaluator = null;
    if (connection == null)

        connection = new UnixConnection();
    else
         connection = connection;

    Object parameterGrid = null;
    Object state = null;
    Object _job = null;
    Object _prevJobStatus = null;
    Object _filesToRelease = []

    Object parameters = null;
    Object model = null;
    Object predictions = null;

    Object parameterFormat = "-%k %v";
    Map<String, Object> parameterDefaults = new HashMap<String, Object>();
    parameterDefaults.put("train", null);
    parameterDefaults.put("classify", null);
    Map<String, Object> parameterAllowNew = new HashMap<String, Object>();
    parameterAllowNew.put("train", true);
    parameterAllowNew.put("classify", true);
    Map<String, Object> parameterValueListKey = new HashMap<String, Object>();
    parameterValueListKey.put("train", null);
    parameterValueListKey.put("classify", null);
    Map<String, Object> parameterValueLimits = new HashMap<String, Object>();
    parameterValueLimits.put("train", null);
    parameterValueLimits.put("classify", null);
    Map<String, Object> parameterValueTypes = new HashMap<String, Object>();
    parameterValueTypes.put("train", null);
    parameterValueTypes.put("classify", null);

    Object trainDirSetting = null;
    Object trainCommand = null;
    Object classifyDirSetting = null;
    Object classifyCommand = null;

}


}
