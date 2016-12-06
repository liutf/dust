package com.dust.other;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.Map;

/**
 * Created by liutf on 2016/8/25.
 */
public class JsonTest {

    @Test
    public void buildJsonStr(){
        JSONObject headObj = new JSONObject();
        headObj.put("TranID","4000020160118091555");
        headObj.put("MessageID","4000000001");

        JSONObject bodyObj = new JSONObject();
        bodyObj.put("id","111");
        bodyObj.put("name","zs");


        JSONObject resultObj = new JSONObject();
        resultObj.put("head",headObj);
        resultObj.put("body",bodyObj);

        System.out.println(resultObj.toJSONString()); //{"head":{"TranID":"4000020160118091555","MessageID":"4000000001"},"body":{"name":"zs","id":"111"}}

    }

    @Test
    public void parseJsonStr(){
        String jsonStr = "{\"head\":{\"TranID\":\"4000020160118091555\",\"MessageID\":\"4000000001\"},\"body\":{\"name\":\"zs\",\"id\":\"111\"}}";
        JSONObject jsonObject = JSON.parseObject(jsonStr);

        Map headObj = (Map) jsonObject.get("head");
        Map bodyObj = (Map) jsonObject.get("body");

        System.out.println(headObj.get("TranID"));
        System.out.println(bodyObj.get("name"));
    }

}
