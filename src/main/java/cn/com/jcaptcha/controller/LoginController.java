package cn.com.jcaptcha.controller;

import cn.com.jcaptcha.util.CaptchaHelper;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by admin on 2017/5/14.
 */
@RestController
public class LoginController {


    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    @ResponseBody
    public String login(HttpServletRequest request) {

        String captcha=request.getParameter("captcha");

        Boolean isResponseCorrect = CaptchaHelper.getInstance().validateResponseForID(request.getSession().getId(), captcha);
        if(isResponseCorrect){
            return "success";
        }

        return "fail";
    }

}
