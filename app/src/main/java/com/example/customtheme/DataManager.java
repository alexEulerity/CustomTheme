package com.example.customtheme;

import java.util.HashMap;
import java.util.Map;

public class DataManager {

    public static Map<String, String> colorSet = new HashMap<>();

    public static void init() {
        colorSet.put("primaryColor", "#3a6c59");
        colorSet.put("primaryTextColor", "#000000");
        colorSet.put("secondaryColor", "#636161");
        colorSet.put("secondaryTextColor", "#FFFFFF");
    }

}
