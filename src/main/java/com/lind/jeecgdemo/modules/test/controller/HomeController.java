package com.lind.jeecgdemo.modules.test.controller;

import com.lind.jeecgdemo.system.vo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("TestController")
@RequestMapping("/test")
public class HomeController {
    @GetMapping("index")
    public Result<?> index() {
        return Result.ok("test.index加载成功");
    }
}
