package hcy.util.kit;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * Created by lxc on 2016/12/1.
 * App端的json处理工具
 * 方便app端json传参
 *
 * 想app端和pc端同时使用这个，因为现在pc端的传0，传1根本不知道是什么
 */
public class JSONHelper {

    public static String errorMsg(String msg){
        ApiResponse resp = new ApiResponse();
        resp.setErrorMsg(msg);
        return JSON.toJSONString(resp);
    }

    public static <T> String toJSONString(T t){
        return JSON.toJSONString(new ObjResponse(t));
    }

    public static <T> String toJSONStringWithDateFormat(T t,SerializerFeature... features){
        return JSON.toJSONString(new ObjResponse(t),SerializeConfig.globalInstance, null, "yyyy-MM-dd HH:mm:ss",JSON.DEFAULT_GENERATE_FEATURE, features);
    }

    public static <T> String toJSONString(T t,SerializeFilter serializeFilter){
        return JSON.toJSONString(t, serializeFilter);
    }
    
    public static String ok() {
        ApiResponse resp = new ApiResponse();
        resp.setSuccess(true);
        return JSON.toJSONString(resp);
    }

    public static String ok(String msg) {
        ApiResponse resp = new ApiResponse();
        resp.setSuccess(true);
        resp.setMsg(msg);
        resp.setCode("200");
        return JSON.toJSONString(resp);
    }
}
