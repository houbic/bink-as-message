package com.bink.mybatis;

import com.bink.entity.Menu;

import java.util.List;

/**
 * Created by chenbinghao on 16/8/31.
 */
public interface MenuMapper {

    List<Menu> getMenuByRoleType(Integer roleType);

}
