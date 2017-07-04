package cn.com.jcaptcha.util;


import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2017/5/17.
 */
public class TestUtil {

    public static  void test(){
        List<Son> list=new ArrayList<Son>();
       Son son=new Son();
       son.setColor("red");
       son.setKey("男");
       list.add(son);
        Son son1=new Son();
        son1.setColor("red");
        son1.setKey("男");
        list.add(son1);
//        JSONArray jsonArray=JSONArray.fromObject(list);
        String str="[{\"color\":\"red\",\"key\":\"男\"},{\"color\":\"red\",\"key\":\"男\"}]";

        JSONArray jsonArray=JSONArray.fromObject(str);

        List<Son> list1=JSONArray.toList(jsonArray,new JsonConfig());
        System.out.print(list1);
    }

    public static void main(String[] args){
        test();
    }
}
