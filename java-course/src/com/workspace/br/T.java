package com.workspace.br;

import com.google.gson.Gson;

public class T {
    public static String json (Object target) {
        Gson g = new Gson();
        return g.toJson(target);
    }
}
