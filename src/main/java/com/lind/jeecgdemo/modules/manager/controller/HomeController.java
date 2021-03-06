package com.lind.jeecgdemo.modules.manager.controller;

import com.lind.jeecgdemo.modules.manager.entity.SysUser;
import com.lind.jeecgdemo.modules.manager.service.SysUserService;
import com.lind.jeecgdemo.system.base.controller.JeecgController;
import com.lind.jeecgdemo.system.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@RestController("UserController")
@RequestMapping("/user")
public class HomeController extends JeecgController<SysUser, SysUserService> {
    @Autowired
    SysUserService sysUserService;

    @GetMapping("index")
    public Result<?> index() {
        return Result.ok("manager.index加载成功");
    }

    @GetMapping("add")
    public Result<?> add() {
        SysUser user = new SysUser();
        user.setUsername("test");
        user.setRealname("测试");
        sysUserService.addUser(user);
        return Result.ok("manager.add加载成功");
    }

    @GetMapping("get-all")
    public Result<?> user() {
        return Result.ok(sysUserService.getUsers());
    }

    @GetMapping("excel")
    public ModelAndView export(HttpServletRequest request) {
        return exportXls(request, sysUserService.list(), "用户表");
    }


}
