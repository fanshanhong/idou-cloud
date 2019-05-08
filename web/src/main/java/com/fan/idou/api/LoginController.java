package com.fan.idou.api;

import com.fan.idou.api.result.IDouJSONResult;
import com.fan.idou.dao.pojo.User;
import com.fan.idou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    UserService userService;

    @GetMapping("/test")
    public String login(@RequestParam(value = "username") String username) {
        return "welcome  " + username;
    }

    @PostMapping("/loginByVerificationCode")
    public IDouJSONResult loginByVerificationCode(@RequestParam String phoneNumber, @RequestParam String verificationCode) {


        if (!isLegal(phoneNumber, verificationCode)) {

            return IDouJSONResult.errorMsg("验证码错误, 请重试");

        }

        User user = userService.queryUserByPhoneNumber(phoneNumber);
        if (user != null) {
            // 查到用户信息并返回
            return IDouJSONResult.ok(user);
        } else {
            // 新用户注册
            User newUser = new User();
            newUser.setPhoneNumber(phoneNumber);
//            userService.createUser(newUser);
//            return DouyinJSONResult.ok(setUserRedisSessionToken(newUser));
            return null;
        }

    }

    /**
     * 判断手机号和验证码是否正确
     *
     * @param phoneNumber
     * @param verificationCode
     * @return
     */
    private boolean isLegal(String phoneNumber, String verificationCode) {

        // 正常来说, 这里应该调用第三方短信SDK的相关接口进行校验.
        // 这里模拟一下, 只要验证码是1234即可
        if (verificationCode.equals("1234")) {
            return true;
        }
        return false;
    }

}
