package com.kby.student.controller;

import com.kby.student.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * <p>
 *
 * @author cyy
 * @version 1.0
 * @since 2024/6/24 14:09
 */
@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Boolean login(@RequestParam(value="username",required = true)String username, @RequestParam("password") String password){
        return userService.login(username,password);
    }


}
