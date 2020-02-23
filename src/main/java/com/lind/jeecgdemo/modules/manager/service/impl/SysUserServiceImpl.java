package com.lind.jeecgdemo.modules.manager.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lind.jeecgdemo.modules.manager.entity.SysUser;
import com.lind.jeecgdemo.modules.manager.mapper.SysUserMapper;
import com.lind.jeecgdemo.modules.manager.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {
    @Autowired
    private SysUserMapper userMapper;

    @Override
    public SysUser getUserByPhone(String phone) {
        return null;
    }

    @Override
    public SysUser getUserByEmail(String email) {
        return userMapper.getUserByEmail(email);
    }

    @Override
    public SysUser getUserByName(String username) {
        return userMapper.getUserByName(username);
    }

    @Override
    public boolean deleteUser(String userId) {
        return userMapper.deleteById(userId) > 0;
    }

    @Override
    public List<SysUser> getUsers() {
        return userMapper.getAll();
    }

    @Override
    public void addUser(SysUser sysUser) {
        userMapper.insert(sysUser);
    }
}
