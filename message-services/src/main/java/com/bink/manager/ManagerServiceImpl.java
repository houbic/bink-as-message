package com.bink.manager;

import com.bink.base.ManagerService;
import com.bink.entity.Menu;
import com.bink.entity.User;
import com.bink.mybatis.MenuMapper;
import com.bink.mybatis.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by chenbinghao on 16/8/27.
 */
@Component("managerService")
public class ManagerServiceImpl implements ManagerService{

    @Autowired
    public UserMapper userMapper;

    @Autowired
    public MenuMapper menuMapper;

    public User getUserByName(String userName) {
        return userMapper.getUserByName(userName);
    }

    public List<Menu> getMenuByRoleType(int roleType) {
        System.out.println("begin to get menu.........." + roleType);
        return menuMapper.getMenuByRoleType(roleType);
    }

}
