package com.easy.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author easy
 * @since 2023-04-10
 */
@TableName("sys_oper_role")
public class SysOperRole implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * role_id
     */
    @TableField("role_id")
    private Integer roleId;

    /**
     * oper_id
     */
    @TableField("oper_id")
    private String operId;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getOperId() {
        return operId;
    }

    public void setOperId(String operId) {
        this.operId = operId;
    }

    @Override
    public String toString() {
        return "SysOperRole{" +
        "roleId = " + roleId +
        ", operId = " + operId +
        "}";
    }
}
