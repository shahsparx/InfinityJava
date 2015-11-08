package com.company;
import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;

/*** Simple app by shahsparx. Uses the JSON simple library.
 * Created by Lenovo on 07-11-2015.
 */
public class JsonParse {
    public static void main(String []args)
    {
        JSONObject obj = new JSONObject();
        obj.put("name","shahrukh");
        obj.put("age",new Integer(100));

        JSONArray list = new JSONArray();
        list.add("msg 1");
        list.add("msg 2");
        list.add("msg 3");

        obj.put("messages",list);

        try{
            FileWriter file = new FileWriter("F:\\test.json");
            file.write(obj.toJSONString());
            file.flush();
            file.close();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.print(obj);
    }
}
