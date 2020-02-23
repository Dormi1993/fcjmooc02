package com.fcj.fcjmooc02.controller;

import com.fcj.fcjmooc02.pojo.IMoocJSONResult;
import com.fcj.fcjmooc02.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by dormi on 2020/2/19.
 */
//@Controller
@RestController //Controller+ResponseBody
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getUser")
//    @ResponseBody
    public User helloj() {
        User user = new User();
        user.setName("bob");
        user.setAge(15);
        user.setBirthday(new Date());
        user.setPassword("haha");

        return user;
    }

    @RequestMapping("/getUserJson")
//    @ResponseBody
    public IMoocJSONResult getUserJson() {
        User user = new User();
        user.setName("bob");
        user.setAge(10);
        user.setBirthday(new Date());
        user.setPassword("haha");
        user.setDesc("90uuu");

        return IMoocJSONResult.ok(user);
    }
}
