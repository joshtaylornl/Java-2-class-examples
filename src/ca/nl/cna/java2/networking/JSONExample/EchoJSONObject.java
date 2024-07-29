package ca.nl.cna.java2.networking.JSONExample;
/**
 * Download json-simple Jar from here:
 * https://repo1.maven.org/maven2/com/googlecode/json-simple/json-simple/1.1.1/
 *
 */

import org.json.simple.JSONObject;

public class EchoJSONObject {

    //JSONObject

    static JSONObject getFooObject(String msg){
        JSONObject obj = new JSONObject();
        obj.put("string",msg);
        obj.put("num",100);
        obj.put("balance",1000.21);
        obj.put("is_vip",true);

        return obj;
    }


}
