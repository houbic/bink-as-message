package com.bink.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public final class JsonMapper {

    public static String toJson(Object object) {
        return JSON.toJSONString(object, new SerializerFeature[]{SerializerFeature.WriteMapNullValue, SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.WriteNonStringKeyAsString});
    }

    public static String toJsonFormat(Object object) {
        return JSON.toJSONString(object, new SerializerFeature[]{SerializerFeature.WriteMapNullValue, SerializerFeature.PrettyFormat, SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.WriteNonStringKeyAsString});
    }

    public static Object toJsonObject(Object obj) {
        return JSON.toJSON(obj);
    }

//    public static <T> T fromJson(String jsonString, Class<T> clazz)
//    {
//        if (StringUtils.isEmpty(jsonString)) {
//            return null;
//        }
//        return JSON.parseObject(jsonString, clazz);
//    }
//
//    public static <T> T fromJson(String jsonString)
//            throws Exception
//    {
//        return JSON.parseObject(jsonString, new TypeReference()
//                {
//                }
//                , new Feature[0]);
//    }
}