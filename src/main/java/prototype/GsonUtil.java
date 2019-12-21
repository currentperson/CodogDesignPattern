/**
 * *****************************************************
 * Copyright (C) 2018 bytedance.com. All Rights Reserved
 * This file is part of bytedance PCS project.
 * Unauthorized copy of this file, via any medium is strictly prohibited.
 * Proprietary and Confidential.
 * ****************************************************
 **/
package prototype;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonUtil {

    private static final Gson GSON = new GsonBuilder()
            .enableComplexMapKeySerialization()
            .create();

    private GsonUtil() {
    }

    public static <T> T convert(String jsonStr, Class<T> classOfT) {
        return GSON.fromJson(jsonStr, classOfT);
    }

    public static String toJson(Object target) {
        return GSON.toJson(target);
    }
}