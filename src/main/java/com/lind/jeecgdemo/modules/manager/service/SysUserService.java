package com.lind.jeecgdemo.modules.manager.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lind.jeecgdemo.modules.manager.entity.SysUser;

/**
 * 用户业务.
 */
public interface SysUserService extends IService<SysUser> {
    SysUser getUserByPhone(String phone);

    SysUser getUserByEmail(String email);

    SysUser getUserByName(String username);

    boolean deleteUser(String userId);
}
