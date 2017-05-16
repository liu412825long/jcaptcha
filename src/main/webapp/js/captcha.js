/**
 * Created by admin on 2017/5/14.
 */
function changeImage(obj){
    $(obj).attr("src","/jcaptcha?"+new Date().getTime());
}