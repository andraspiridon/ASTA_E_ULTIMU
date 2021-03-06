package com.dily.Controllers;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by Andra on 5/1/2017.
 */
@Controller
@RequestMapping("/api")
public class HelloController {
    @RequestMapping("/api/hello")
    public String greet(){
        System.out.println("SAlut");
        return "Hello from the thr side";
    }

    @RequestMapping(value = {"json"},method = RequestMethod.GET)
    @ResponseBody
    public void jsonTest(JSONObject json){
        JSONObject jsonObject = json;
        String m = jsonObject.get("username").toString();
        String t = jsonObject.get("password").toString();
        System.out.println(m + 'a' +t);
    }
}
