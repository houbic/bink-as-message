package com.bink.entity;

/**
 * Created by chenbinghao on 16/8/27.
 */
public class Menu {

    /**
     * 菜单id
     */
    private int menuId;

    /**
     * 父级菜单id
     */
    private int parentId;

    /**
     * 菜单名字
     */
    private String menuName;

    /**
     * 可视角色类型
     */
    private int roleType;

    /**
     * html路径
     */
    private String htmlPath;

    /**
     * 菜单图片路径
     */
    private String imagePath;

    public int getMenuId() {
        return menuId;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getRoleType() {
        return roleType;
    }

    public void setRoleType(int roleType) {
        this.roleType = roleType;
    }

    public String getHtmlPath() {
        return htmlPath;
    }

    public void setHtmlPath(String htmlPath) {
        this.htmlPath = htmlPath;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }
}
