package com.markerhub.controller;

import com.baomidou.mybatisplus.extension.api.R;
import com.markerhub.common.lang.Result;
import com.markerhub.entity.User;
import com.markerhub.service.IUserService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author YaaXxx_Guo
 * @since 2021-09-01
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService IUserService;

    @RequiresAuthentication
    @GetMapping("/{id}")
    public Result test(@PathVariable("id") Long id) {
        User user = IUserService.getById(id);
        return Result.succ(user);
    }

    @PostMapping("/save")
    public Result save(@Validated @RequestBody User user) {
        return Result.succ(user);
    }
}
