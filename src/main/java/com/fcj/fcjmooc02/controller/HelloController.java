package com.fcj.fcjmooc02.controller;

import com.fcj.fcjmooc02.pojo.IMoocJSONResult;
import com.fcj.fcjmooc02.pojo.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dormi on 2020/2/19.
 */
@RestController
public class HelloController {
    @Autowired
    private Resource resource;

    @RequestMapping("/hello")
    public Object helloj() {
        return "hello spring boot~~~";
    }

    @RequestMapping("/getResource")
    public IMoocJSONResult getResource() {

        Resource bean = new Resource();
        BeanUtils.copyProperties(resource, bean);

        return IMoocJSONResult.ok(bean);
    }

}
