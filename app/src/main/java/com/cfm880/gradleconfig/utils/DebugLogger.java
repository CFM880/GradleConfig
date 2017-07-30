package com.cfm880.gradleconfig.utils;


import com.orhanobut.logger.Logger;
import com.tango.zhibodi.datasource.auxiliary.APIConstant;

/**
 * Created by chengfangming on 2017/4/10.
 */

public class DebugLogger {
    private static final boolean DEBUG = APIConstant.APP_DEBUG;

    public static void debug(String message) {
        if (DEBUG) {
            Logger.d(message);
        }
    }

    public static void error(String message) {
        if (DEBUG) {
            Logger.d(message);
        }
    }

    public static void json(String json) {
        if (DEBUG) {
            Logger.json(json);
        }
    }

    public static void object2jsonString(Object object) {
        if (DEBUG) {
            Logger.json(GsonUtil.toJson(object));
        }
    }

    public static void object(Object object) {
        if (DEBUG) {
            Logger.d(object);
        }
    }

}
