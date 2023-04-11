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
@TableName("sys_oper")
public class SysOper implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * oper_id
     */
    @TableId(value = "oper_id", type = IdType.AUTO)
    private Integer operId;

    /**
     * 用户名
     */
    @TableField("oper_name")
    private String operName;

    /**
     * 密码
     */
    @TableField("oper_pass")
    private String operPass;

    /**
     * 姓名
     */
    @TableField("name")
    private String name;

    /**
     * 证件号
     */
    @TableField("cert_no")
    private String certNo;

    /**
     * 手机号
     */
    @TableField("mobile")
    private String mobile;

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

    public Integer getOperId() {
        return operId;
    }

    public void setOperId(Integer operId) {
        this.operId = operId;
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName;
    }

    public String getOperPass() {
        return operPass;
    }

    public void setOperPass(String operPass) {
        this.operPass = operPass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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
        return "SysOper{" +
        "operId = " + operId +
        ", operName = " + operName +
        ", operPass = " + operPass +
        ", name = " + name +
        ", certNo = " + certNo +
        ", mobile = " + mobile +
        ", state = " + state +
        ", createTime = " + createTime +
        ", updateTime = " + updateTime +
        "}";
    }
}
