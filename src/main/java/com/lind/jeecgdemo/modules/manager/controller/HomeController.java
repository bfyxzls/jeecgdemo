package com.lind.jeecgdemo.modules.manager.controller;

import com.lind.jeecgdemo.modules.manager.service.SysUserService;
import com.lind.jeecgdemo.system.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("ProductController")
@RequestMapping("/product")
public class HomeController {
    @Autowired
    SysUserService sysUserService;

    @GetMapping("index")
    public Result<?> index() {
        return Result.ok("manager.index加载成功");
    }

    @GetMapping("user")
    public Result<?> user() {
        return Result.ok(sysUserService.getUserByName("admin"));
    }

}
