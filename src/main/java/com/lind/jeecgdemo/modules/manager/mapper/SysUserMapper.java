package com.lind.jeecgdemo.modules.manager.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lind.jeecgdemo.modules.manager.entity.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysUserMapper extends BaseMapper<SysUser> {
    /**
     * 通过用户账号查询用户信息
     *
     * @param username
     * @return
     */
    SysUser getUserByName(@Param("username") String username);

    /**
     * 根据手机号查询用户信息
     *
     * @param phone
     * @return
     */
    SysUser getUserByPhone(@Param("phone") String phone);

    /**
     * 根据邮箱查询用户信息
     *
     * @param email
     * @return
     */
    SysUser getUserByEmail(@Param("email") String email);

    /**
     * 获取所有数据.
     *
     * @return
     */
    List<SysUser> getAll();
}
