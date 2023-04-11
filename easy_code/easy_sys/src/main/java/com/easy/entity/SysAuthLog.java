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
@TableName("sys_auth_log")
public class SysAuthLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * log_id
     */
    @TableId(value = "log_id", type = IdType.AUTO)
    private Integer logId;

    /**
     * oper_id
     */
    @TableField("oper_id")
    private String operId;

    /**
     * tr_code
     */
    @TableField("tr_code")
    private String trCode;

    /**
     * 备注
     */
    @TableField("note")
    private String note;

    /**
     * 创建时间
     */
    @TableField("insert_time")
    private LocalDate insertTime;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public String getOperId() {
        return operId;
    }

    public void setOperId(String operId) {
        this.operId = operId;
    }

    public String getTrCode() {
        return trCode;
    }

    public void setTrCode(String trCode) {
        this.trCode = trCode;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public LocalDate getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(LocalDate insertTime) {
        this.insertTime = insertTime;
    }

    @Override
    public String toString() {
        return "SysAuthLog{" +
        "logId = " + logId +
        ", operId = " + operId +
        ", trCode = " + trCode +
        ", note = " + note +
        ", insertTime = " + insertTime +
        "}";
    }
}
