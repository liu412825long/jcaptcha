package cn.com.jcaptcha.service.impl;

import cn.com.jcaptcha.service.ImageService;
import com.octo.captcha.service.CaptchaServiceException;
import com.octo.captcha.service.image.ImageCaptchaService;

import java.awt.image.BufferedImage;
import java.util.Locale;

/**
 * Created by admin on 2017/5/16.
 */
public class ImageServiceImpl implements ImageCaptchaService {

    public BufferedImage getImageChallengeForID(String s) throws CaptchaServiceException {
        return null;
    }

    public BufferedImage getImageChallengeForID(String s, Locale locale) throws CaptchaServiceException {
        return null;
    }

    public Object getChallengeForID(String s) throws CaptchaServiceException {
        return null;
    }

    public Object getChallengeForID(String s, Locale locale) throws CaptchaServiceException {
        return null;
    }

    public String getQuestionForID(String s) throws CaptchaServiceException {
        return null;
    }

    public String getQuestionForID(String s, Locale locale) throws CaptchaServiceException {
        return null;
    }

    public Boolean validateResponseForID(String s, Object o) throws CaptchaServiceException {
        return null;
    }
}
