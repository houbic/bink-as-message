package com.bink.base;

import com.bink.entity.Menu;
import com.bink.entity.User;

import java.util.List;

/**
 * Created by chenbinghao on 16/8/27.
 */
public interface ManagerService {

    /**
     * 获取用户信息
     * @return
     */
    User getUserByName(String userName);

    /**
     * 获取菜单列表
     * @return
     */
    List<Menu> getMenuByRoleType(int roleType);

}
