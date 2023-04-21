package com.easy.interceptor;

import com.alibaba.fastjson2.JSONObject;
import com.easy.config.GlobalException;
import com.easy.config.ResultData;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.stream.Collectors;

public class TestInterceptor implements HandlerInterceptor {
    private static final Logger log = LoggerFactory.getLogger(TestInterceptor.class);

    /**
     * Controller方法处理之前
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("2.拦截器：HandlerInterceptor");
        ResultData ret = ResultData.init();
        if ("POST".equalsIgnoreCase(request.getMethod())) {
            String para = getPostData(request);
            try{
                ret.setPara(JSONObject.parseObject(para));
            }catch (Exception e){
                log.info("请求参数错误");
                throw new GlobalException(1,"请求参数错误");
            }
            request.setAttribute("resultData",ret);

        }else{
            return false;
        }
        //放行
        return true;
    }

    /**
     * preHandle返回true，Controller方法处理完之后 DispatcherServlet进行视图的渲染之前
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.info("2.拦截器：postHandle");
        String data = request.getAttribute("resultData").toString();
        response.setContentType("application/json;charset=UTF-8");
        response.setDateHeader("Expires", 0);
        BufferedWriter writer = null;
        try {
            //2022-08-10,pengm,若有下载文件(txt)情况时，write时会把resultdata数据追加到下载文件后面了，因此加判断
            if(!response.isCommitted()) {
                log.info(data);
                writer = new BufferedWriter(new OutputStreamWriter(response.getOutputStream(), "UTF-8"));
                if (data != null) {
                    writer.write(data);
                }
                writer.flush();
                writer.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                }
            }
        }
    }

    /**
     * preHandle返回true，DispatcherServlet进行视图的渲染之后
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }

    /**
     * 获取post请求参数
     * @param request
     * @return 请求参数
     * @throws IOException
     */
    private static String getPostData(HttpServletRequest request) throws IOException {
        //获取请求参数
        return request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
    }
}
