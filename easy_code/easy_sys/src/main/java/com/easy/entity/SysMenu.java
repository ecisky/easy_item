package com.easy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * <p>
 * 
 * </p>
 *
 * @author easy
 * @since 2023-04-10
 */
@TableName("sys_menu")
public class SysMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * menu_id
     */
    @TableId(value = "menu_id", type = IdType.AUTO)
    private Integer menuId;

    /**
     * 功能名
     */
    @TableField("menu_name")
    private String menuName;

    /**
     * 功能级别
     */
    @TableField("menu_level")
    private String menuLevel;

    /**
     * 父功能名
     */
    @TableField("parent_menu_id")
    private String parentMenuId;

    /**
     * 状态 0正常 1注销
     */
    @TableField("state")
    private String state;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDate createTime;

    /**
     * 更新时间
     */
    @TableField("update_time")
    private LocalDate updateTime;

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(String menuLevel) {
        this.menuLevel = menuLevel;
    }

    public String getParentMenuId() {
        return parentMenuId;
    }

    public void setParentMenuId(String parentMenuId) {
        this.parentMenuId = parentMenuId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public LocalDate getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDate createTime) {
        this.createTime = createTime;
    }

    public LocalDate getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDate updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "SysMenu{" +
        "menuId = " + menuId +
        ", menuName = " + menuName +
        ", menuLevel = " + menuLevel +
        ", parentMenuId = " + parentMenuId +
        ", state = " + state +
        ", createTime = " + createTime +
        ", updateTime = " + updateTime +
        "}";
    }
}
