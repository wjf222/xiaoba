package com.xiaoba.controller;

import com.xiaoba.module.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhouning
 */
@Controller
public class LoginController {

    //    @PostMapping("/login")
//    @ResponseBody
//    public Map<String,String> login(@RequestBody UserModel user){
//        Map<String,String> map = new HashMap<>();
//        map.put("token",user.getUserName());
////        map.put("password",password);
//        return map;
//    }
    @PostMapping("/login")
    @ResponseBody
    public Map<String, String> login(@RequestParam(name="userName") String name,
                                     @RequestParam(name="password") String password) {
        Map<String, String> map = new HashMap<>();
        map.put("token", name);
//        map.put("password",password);
        return map;
    }
}
