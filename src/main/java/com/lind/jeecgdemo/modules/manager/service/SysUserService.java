package com.lind.jeecgdemo.modules.manager.service;

import ch.qos.logback.classic.pattern.SyslogStartConverter;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lind.jeecgdemo.modules.manager.entity.SysUser;

import java.util.List;

/**
 * 用户业务.
 */
public interface SysUserService extends IService<SysUser> {
    SysUser getUserByPhone(String phone);

    SysUser getUserByEmail(String email);

    SysUser getUserByName(String username);

    boolean deleteUser(String userId);

    List<SysUser> getUsers();

    void addUser(SysUser sysUser);
}
