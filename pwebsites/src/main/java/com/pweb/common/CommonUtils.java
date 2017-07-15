package com.pweb.common;

import net.sf.json.JSON;
import net.sf.json.JSONObject;

import java.util.List;

/**
 * Created by Administrator on 2017/7/15 0015.
 */
public class CommonUtils {

    public static JSONObject setResult(boolean isfalse, Object object) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status", isfalse);
        jsonObject.put("result", object);
        return jsonObject;
    }

    public static JSONObject setResultList(boolean isfalse, List list, int count) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status", isfalse);
        jsonObject.put("list", list);
        jsonObject.put("count", count);
        return jsonObject;
    }
}
