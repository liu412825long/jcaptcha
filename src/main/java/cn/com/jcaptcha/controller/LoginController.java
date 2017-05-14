package cn.com.jcaptcha.controller;

import com.octo.captcha.service.image.ImageCaptchaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by admin on 2017/5/14.
 */
@RestController
public class LoginController {

    @Autowired
    private ImageCaptchaService imageCaptchaService;

    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    @ResponseBody
    public Boolean login(String captcha, HttpServletRequest request) {

        Boolean isResponseCorrect = imageCaptchaService.validateResponseForID(request.getSession().getId(), captcha);

        return isResponseCorrect;
    }

}
