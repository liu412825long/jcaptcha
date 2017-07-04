package cn.com.jcaptcha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by admin on 2017/5/25.
 */
@Controller
public class PageController {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}
