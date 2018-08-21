package open.aip.peakchao.com.apiopenapp.util;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Chao  2018/8/21 on 15:20
 * description
 */

public class JsonUtil {

    public static String formatJson(String json) {
        try {
            if (json.startsWith("{")) {
                json = new JSONObject(json).toString(4);
            } else if (json.startsWith("[")) {
                json = new JSONArray(json).toString(4);
            } else {
                return json;//不是json返回源内容
            }
        } catch (JSONException e) {
            e.printStackTrace();
            return json;//不是json返回源内容
        }
        return json;
    }
}
