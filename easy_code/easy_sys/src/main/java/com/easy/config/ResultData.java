package com.easy.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.servlet.http.HttpServletRequest;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;

public class ResultData {

    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    private JSONObject para;
    private JSONObject data;
    private Integer result_code;
    private String msg;

    public JSONObject getPara() {
        return para;
    }

    public void setPara(JSONObject para) {
        this.para = para;
    }

    public JSONObject getData() {
        return data;
    }

    public void setData(JSONObject data) {
        this.data = data;
    }

    public Integer getResult_code() {
        return result_code;
    }

    public void setResult_code(Integer result_code) {
        this.result_code = result_code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    public static ResultData init() {
        ResultData ret = new ResultData();
        ret.result_code = 0;
        return ret;
    }

    public static ResultData init(HttpServletRequest request) {
        ResultData resultData = (ResultData) request.getAttribute("resultData");
        return resultData;
    }
}
