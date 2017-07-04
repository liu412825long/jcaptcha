package cn.com.jcaptcha.util;


import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

/**
 * Created by admin on 2017/5/19.
 */
public class CacheUtil {

   public static void main(String[] args){
       CacheManager cacheManager= CacheManager.getInstance();
      Cache cache= cacheManager.getCache("helloworld1");
       Element element=new Element("myKey","LiuHaiLong");
   }
}
