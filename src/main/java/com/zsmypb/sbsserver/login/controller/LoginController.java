package com.zsmypb.sbsserver.login.controller;

import com.zsmypb.sbsserver.login.domain.UserParam;
import com.zsmypb.sbsserver.login.service.LoginService;
import com.zsmypb.sbsserver.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangs.
 * @date 2019/11/7.
 */
@RestController
@RequestMapping("/LoginController")
@Slf4j
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping("/login")
    public Result login(@RequestBody UserParam param) {
        log.info("param {}", param);
        return Result.ok("连接成功");
    }
}
