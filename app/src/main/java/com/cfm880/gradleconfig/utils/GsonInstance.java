package com.cfm880.gradleconfig.instance;

import com.google.gson.Gson;

/**
 * Created by chengfangming on 2017/7/30.
 */

public class GsonInstance {
    private static class Instance{
        public Gson mGson = new Gson();
    }

    private GsonInstance(){}

    public static Gson getInstance(){
    }
}
