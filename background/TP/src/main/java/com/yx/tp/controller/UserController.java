package com.yx.tp.controller;

import com.yx.tp.pojo.UserLogin;
import com.yx.tp.pojo.VO.UserLoginVO;
import com.yx.tp.service.UserService;
import com.yx.tp.util.TpJSONResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.Service;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/u")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/hello")
    public Object say(){
        return "hello";
    }


    @RequestMapping("/search/{id}/{pd}")
    public Object search(@PathVariable String id, @PathVariable String pd){
        UserLogin userLogin = userService.queryUserForLogin(id, pd);
        return userLogin;
    }

    /**
     * @Author YangXiao
     * @Description //TODO 用户注册和登录
     * @Date 23:12 2022-04-06
     * @Param
     * @return
     **/
    @PostMapping("/registOrLogin")
    public TpJSONResult registOrLogin(@RequestBody UserLogin userLogin) throws Exception{
        // 判断用户名和密码不为空
        if (StringUtils.isBlank(userLogin.getUserId()) || StringUtils.isBlank(userLogin.getPassWord())){
           return TpJSONResult.errorMsg("用户密码或姓名不能为空");
        }
        //判断用户名是否存在
        boolean userIsExist = userService.queryUsernameIsExist(userLogin.getUserId());
        //登录或注册
        UserLogin userLogin1 = null;
        if(userIsExist){
            userLogin1 = userService.queryUserForLogin(userLogin.getUserId(),userLogin.getPassWord());
            if(userLogin1 == null){
                return TpJSONResult.errorMsg("输入的密码错误");
            }
        }else {
            userLogin1 = userService.saveUser(userLogin);
        }
        UserLoginVO result = new UserLoginVO();
        BeanUtils.copyProperties(userLogin1, result);
        return TpJSONResult.ok(result);
    }
    /**
     * @Author YangXiao
     * @Description //TODO 测试文件上传
     * @Date 23:50 2022-04-08
     * @Param
     * @return
     **/
    @PostMapping("/up")
    public void upf(@RequestParam("name") MultipartFile filec, HttpServletRequest request) throws IOException {
        File fileDir = new File("G:/java");
        if(!fileDir.exists()) {
            //如果没有目录应该创建目录
            fileDir.mkdirs();
        }
        //获取图片名称
        String imgName = filec.getOriginalFilename();
        String path = "G:/java/"+imgName;
        //文件实现上传
        filec.transferTo(new File(path));

        //方式二：getParameterNames()：获取所有参数名称
        Map<String,String> parmMap=new HashMap<String,String>();
        Enumeration<String> a = request.getParameterNames();
        String parm=null;
        String val="";
        while(a.hasMoreElements()){
            //参数名
            parm=a.nextElement();
            //值
            val=request.getParameter(parm);
            parmMap.put(parm, val);
        }
        System.out.println("parmMap=========="+parmMap);
        parmMap.forEach((k,v)->{
            System.out.println(k+'\t'+v);
        });









    }







}
